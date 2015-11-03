public class Shapes
{
    public static void main( String[] args )
    {
        ColorTriangle t1 = new ColorTriangle( "Blue", "outlined", 8, 12 );
        ColorTriangle t2 = new ColorTriangle( "Red", "filled", 2, 2 );

        System.out.println( "Info for t1: " );
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println( "Area is " + t1.area() );

        System.out.println();

        System.out.println( "Info for t2: " );
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println( "Area is " + t2.area() );
    }
}
