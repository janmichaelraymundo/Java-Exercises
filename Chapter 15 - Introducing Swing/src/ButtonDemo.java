import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonDemo implements ActionListener
{
    JLabel label;

    public ButtonDemo()
    {
        label = new JLabel();
        JFrame frame = new JFrame( "A Button Example" );
        frame.setLayout( new FlowLayout() );
        frame.setSize( 220, 90 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        JButton up = new JButton( "Up!" );
        JButton down = new JButton( "Down!" );
        up.addActionListener( this );
        down.addActionListener( this );
        frame.add( up );
        frame.add( down );
        frame.add( label );
        frame.setVisible( true );

    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        label.setText( e.getActionCommand() );
    }

    public static void main( String[] args )
    {
        new ButtonDemo();
    }

}
