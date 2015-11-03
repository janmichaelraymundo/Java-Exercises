public class TwoDShape
{
    private double width;

    private double height;

    public void showDim()
    {
        System.out.println( "Width and height are " + width + " and " + height );
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth( double w )
    {
        width = w;
    }

    public void setHeight( double h )
    {
        height = h;
    }
}
