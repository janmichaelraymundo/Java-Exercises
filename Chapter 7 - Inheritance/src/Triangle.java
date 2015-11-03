public class Triangle extends TwoDShape
{
    String style;

    public Triangle( String s, double w, double h )
    {
        style = s;
        setWidth( w );
        setHeight( h );
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
