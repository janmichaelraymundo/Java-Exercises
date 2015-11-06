import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * <applet code="MouseEvents" width=300 height=100< </applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
{
    String msg = "";

    int mouseX = 0, mouseY = 0;

    public void init()
    {
        addMouseListener( this );
        addMouseMotionListener( this );
    }

    @Override
    public void mouseDragged( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked( MouseEvent e )
    {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse clicked";
        repaint();
    }

    @Override
    public void mousePressed( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited( MouseEvent e )
    {
        // TODO Auto-generated method stub

    }

    public void paint( Graphics g )
    {
        g.drawString( msg, mouseX, mouseY );
    }

}
