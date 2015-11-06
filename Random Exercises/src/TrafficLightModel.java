import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TrafficLightModel
{
    private ArrayList< ChangeListener > listenerList = new ArrayList< ChangeListener >();

    TrafficColor currentColor;

    MyTimer timer;

    public TrafficLightModel()
    {
        currentColor = TrafficColor.RED;
    }

    public void activate()
    {
        timer = new MyTimer();
    }

    class MyTimer implements Runnable
    {
        Thread myThread;

        boolean isChanged = true;

        public MyTimer()
        {
            myThread = new Thread( this );
            myThread.start();
        }

        @Override
        public void run()
        {
            while( true )
            {
                try
                {
                    // synchronized( this )
                    // {
                    // if( !isChanged )
                    // {
                    // wait();
                    // }
                    for( int currentDuration = currentColor.getMaxDuration(); currentDuration > 0; currentDuration-- )
                    {
                        fireStateChanged( currentDuration );
                        Thread.sleep( 1000 );
                    }
                    isChanged = false;
                    changeColor();
                    // }
                }
                catch( InterruptedException e )
                {
                    e.printStackTrace();
                }

            }
        }

        synchronized private void changeColor()
        {
            if( TrafficColor.RED == currentColor )
            {
                currentColor = TrafficColor.GREEN;
            }
            else if( TrafficColor.YELLOW == currentColor )
            {
                currentColor = TrafficColor.RED;
            }
            else
            {
                currentColor = TrafficColor.YELLOW;
            }
            fireStateChanged( currentColor );
            isChanged = true;
            notify();
        }

        private void fireStateChanged( Object object )
        {
            ChangeEvent e = new ChangeEvent( object );
            for( ChangeListener listener : listenerList )
            {
                listener.stateChanged( e );
            }
        }
    }

    public static void main( String[] args )
    {
        new TrafficLightModel();
    }

    public void addChangeListener( ChangeListener listener )
    {
        listenerList.add( listener );
    }
}
