public class Triangle extends TwoDShape
{
    String style;

    public Triangle()
    {
        super();
        style = "none";
    }

    public Triangle( double x )
    {
        super( x );
        style = "filled";
    }

    public Triangle( String s, double w, double h )
    {
        super( w, h );
        style = s;
    }

    public double area()
    {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle()
    {
        System.out.println( "Triangle is " + style );
    }
}
