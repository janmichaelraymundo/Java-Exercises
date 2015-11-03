public class TwoDShape
{

    private double height;

    private double width;

    public TwoDShape( double w, double h )
    {
        width = w;
        height = h;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setHeight( double h )
    {
        height = h;
    }

    public void setWidth( double w )
    {
        width = w;
    }

    public void showDim()
    {
        System.out.println( "Width and height are " + width + " and " + height );
    }
}
