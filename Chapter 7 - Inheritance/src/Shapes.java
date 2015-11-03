public class Shapes
{
    public static void main( String[] args )
    {
        Triangle t1 = new Triangle( "filled", 4, 4 );
        Triangle t2 = new Triangle( "outline", 8, 12 );

        System.out.println( "Info for t1: " );
        t1.showStyle();
        t1.showDim();
        System.out.println( "Area is " + t1.area() );

        System.out.println();

        System.out.println( "Info for t2: " );
        t2.showStyle();
        t2.showDim();
        System.out.println( "Area is " + t2.area() );
    }
}
