import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySwingApplet extends JApplet
{
    JButton up;

    JButton down;

    JLabel label;

    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait( new Runnable()
            {
                @Override
                public void run()
                {
                    makeGUI();
                }
            } );
        }
        catch( Exception e )
        {

        }
    }

    public void makeGUI()
    {
        setLayout( new FlowLayout() );
        up = new JButton( "Up" );
        down = new JButton( "Down" );

        up.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                label.setText( "You pressed up." );
            }
        } );

        down.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                label.setText( "You pressed down." );
            }
        } );

        add( up );
        add( down );

        label = new JLabel( "Press a button." );
        add( label );
    }
}
