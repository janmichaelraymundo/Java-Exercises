import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet
{
    public void paint( Graphics g )
    {
        g.drawString( "Java makes applets easy.", 20, 20 );
    }
}
