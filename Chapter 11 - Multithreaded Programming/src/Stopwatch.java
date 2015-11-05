import javax.swing.JLabel;

public class Stopwatch extends Thread
{
    int hours;

    int minutes;

    int seconds;

    boolean paused;

    JLabel label;

    public Stopwatch()
    {
        label = new JLabel();
        label.setVisible( true );
        reset();
        start();
    }

    public void run()
    {
        try
        {
            while( true )
            {
                if( hours == 24 ) hours = 0;
                while( minutes < 60 )
                {
                    while( seconds < 60 )
                    {
                        synchronized( this )
                        {
                            while( paused )
                            {
                                wait();
                            }
                        }
                        updateDisplay();
                        seconds++;
                        sleep( 1000 );
                    }
                    seconds = 0;
                    minutes++;
                }
                minutes = 0;
                hours++;
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( getName() + " interrupted." );
        }
    }

    private void reset()
    {
        paused = true;
        hours = 0;
        minutes = 0;
        seconds = 0;
        updateDisplay();
    }

    synchronized void startTime()
    {
        if( paused )
        {
            paused = false;
            notify();
        }
    }

    synchronized void pauseTime()
    {
        if( !paused )
        {
            paused = true;
        }
    }

    synchronized void stopTime()
    {
        reset();
        notify();
    }

    private void updateDisplay()
    {
        String strHr = getStringVersion( hours );
        String strMin = getStringVersion( minutes );
        String strSec = getStringVersion( seconds );
        label.setText( strHr + ":" + strMin + ":" + strSec );
    }

    private String getStringVersion( int digits )
    {
        if( digits < 10 )
        {
            return "0" + digits;
        }
        return "" + digits;
    }

    public JLabel getLabel()
    {
        return label;
    }
}
