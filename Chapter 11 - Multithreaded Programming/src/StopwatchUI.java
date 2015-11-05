import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StopwatchUI extends JPanel
{
    Stopwatch watch;

    public StopwatchUI()
    {
        watch = new Stopwatch();
        JLabel myLabel = watch.getLabel();
        add( myLabel );
        JButton startButton = new JButton( "Start" );
        JButton pauseButton = new JButton( "Pause" );
        JButton stopButton = new JButton( "Stop" );
        startButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                watch.startTime();
            }
        } );
        pauseButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                watch.pauseTime();
            }
        } );
        stopButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                watch.stopTime();
            }
        } );

        add( startButton );
        add( pauseButton );
        add( stopButton );
    }

    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        frame.addWindowListener( new WindowAdapter()
        {
            public void windowClosing( WindowEvent e )
            {
                System.exit( 0 );
            }
        } );
        StopwatchUI ui = new StopwatchUI();
        frame.setContentPane( ui );
        frame.pack();
        frame.setVisible( true );
    }
}
