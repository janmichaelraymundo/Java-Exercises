import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TrafficLightView implements ChangeListener
{
    JLabel timer;

    JPanel red;

    JPanel yellow;

    JPanel green;

    JPanel parentPanel;

    JFrame frame;

    TrafficLightModel model;

    Color current;

    public TrafficLightView()
    {
        frame = new JFrame();
        parentPanel = new JPanel();
        parentPanel.setBackground( Color.BLACK );
        parentPanel.setLayout( new GridLayout( 4, 1 ) );
        current = Color.RED;
        red = initializeLight( Color.RED );
        yellow = initializeLight( Color.YELLOW );
        green = initializeLight( Color.GREEN );
        timer = new JLabel();
        timer.setHorizontalAlignment( JLabel.CENTER );
        timer.setForeground( current );
        model = new TrafficLightModel();
        model.addChangeListener( this );
        parentPanel.add( red );
        parentPanel.add( yellow );
        parentPanel.add( green );
        parentPanel.add( timer );
        frame.add( parentPanel );
        frame.setSize( new Dimension( 100, 100 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        model.activate();
    }

    private JPanel initializeLight( Color color )
    {
        JPanel panel = new JPanel()
        {
            public void paintComponent( Graphics g )
            {
                if( color == current )
                {
                    g.setColor( color.brighter() );
                }
                else
                {
                    g.setColor( color.darker() );
                }
                Graphics2D g2d = ( Graphics2D ) g;
                int width = getHeight() - 2;
                int height = getHeight() - 2;
                Ellipse2D.Double circle = new Ellipse2D.Double( ( getWidth() - width ) / 2,
                        ( getHeight() - height ) / 2, width, height );
                g2d.fill( circle );
            }
        };
        panel.setSize( new Dimension( 10, 10 ) );
        return panel;
    }

    @Override
    public void stateChanged( ChangeEvent e )
    {
        Object source = e.getSource();
        if( source instanceof TrafficColor )
        {
            setLightColor( ( TrafficColor ) source );
        }
        else
        {
            updateTimer( ( int ) source );
        }
        frame.repaint();
    }

    private void updateTimer( int source )
    {
        if( source < 10 )
        {
            timer.setText( "0" + source );
        }
        else
        {
            timer.setText( "" + source );
        }
    }

    private void setLightColor( TrafficColor source )
    {
        if( TrafficColor.RED == source )
        {
            current = Color.RED;
        }
        else if( TrafficColor.YELLOW == source )
        {
            current = Color.YELLOW;
        }
        else
        {
            current = Color.GREEN;
        }
        timer.setForeground( current );
    }

    public static void main( String[] args )
    {
        new TrafficLightView();
    }
}
