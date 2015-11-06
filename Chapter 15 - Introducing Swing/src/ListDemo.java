import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;

public class ListDemo implements ListSelectionListener
{
    JList< String > list;

    JLabel label;

    JScrollPane scrollPane;

    String names[] = { "Sherry", "Jon", "Rachel", "Sasha", "Jesselyn", "Randy", "Tom", "Mary", "Ken", "Andrew", "Matt",
            "Todd" };

    public ListDemo()
    {
        JFrame frame = new JFrame( "JList Demo" );
        frame.setLayout( new FlowLayout() );
        frame.setSize( 200, 160 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        list = new JList< >( names );
        list.setSelectionMode( ListSelectionModel.SINGLE_INTERVAL_SELECTION );
        scrollPane = new JScrollPane( list );
        scrollPane.setPreferredSize( new Dimension( 120, 90 ) );
        label = new JLabel( "Please choose a name" );
        list.addListSelectionListener( this );
        frame.add( scrollPane );
        frame.add( label );
        frame.setVisible( true );
    }

    @Override
    public void valueChanged( ListSelectionEvent e )
    {
        int index = list.getSelectedIndex();
        if( index != -1 )
        {
            label.setText( "Current selection: " + names[index] );
        }
        else
        {
            label.setText( "Please choose a name." );
        }
    }

    public static void main( String[] args )
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new ListDemo();
            }
        } );
    }
}
