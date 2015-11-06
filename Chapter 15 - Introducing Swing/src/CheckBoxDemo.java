import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxDemo implements ItemListener
{
    JLabel selected;

    JLabel changed;

    JCheckBox a;

    JCheckBox b;

    JCheckBox c;

    public CheckBoxDemo()
    {
        JFrame frame = new JFrame( "Demonstrate Check Boxes" );
        frame.setLayout( new FlowLayout() );
        frame.setSize( 240, 120 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        selected = new JLabel();
        changed = new JLabel();

        a = new JCheckBox( "A" );
        b = new JCheckBox( "B" );
        c = new JCheckBox( "C" );

        a.addItemListener( this );
        b.addItemListener( this );
        c.addItemListener( this );

        frame.add( a );
        frame.add( b );
        frame.add( c );
        frame.add( changed );
        frame.add( selected );

        frame.setVisible( true );
    }

    @Override
    public void itemStateChanged( ItemEvent e )
    {
        String selectedBoxes = "";

        JCheckBox box = ( JCheckBox ) e.getItem();

        if( box.isSelected() )
        {
            changed.setText( box.getText() + " was just selected." );
        }
        else
        {
            changed.setText( box.getText() + " was just cleared." );
        }

        if( a.isSelected() )
        {
            selectedBoxes += "A ";
        }
        if( b.isSelected() )
        {
            selectedBoxes += "B ";
        }
        if( c.isSelected() )
        {
            selectedBoxes += "C ";
        }

        selected.setText( "Selected check boxes: " + selectedBoxes );
    }

    public static void main( String[] args )
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new CheckBoxDemo();
            }
        } );
    }
}
