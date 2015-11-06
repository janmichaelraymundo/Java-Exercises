import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextFieldDemo implements ActionListener
{
    JTextField textField;

    JButton button;

    JLabel prompt, contents;

    public TextFieldDemo()
    {
        JFrame frame = new JFrame( "Use a Text Field" );
        frame.setLayout( new FlowLayout() );
        frame.setSize( 240, 120 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        textField = new JTextField( 10 );
        textField.setActionCommand( "myTextField" );

        button = new JButton( "Reverse" );

        textField.addActionListener( this );
        button.addActionListener( this );

        prompt = new JLabel( "Enter text: " );
        contents = new JLabel( "" );
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        // TODO Auto-generated method stub

    }
}
