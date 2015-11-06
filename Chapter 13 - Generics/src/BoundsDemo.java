
public class BoundsDemo
{
    public static void main( String[] args )
    {
        NumericFns< Integer > iOb = new NumericFns< Integer >( 5 );
        System.out.println( "Reciprocal of " + iOb.getNumber() + " is " + iOb.reciprocal() );
        System.out.println( "Fractional component of " + iOb.getNumber() + " is " + iOb.fraction() );
        System.out.println();

        NumericFns< Double > dOb = new NumericFns< Double >( 5.25 );
        System.out.println( "Reciprocal of " + dOb.getNumber() + " is " + dOb.reciprocal() );
        System.out.println( "Fractional component of " + dOb.getNumber() + " is " + dOb.fraction() );
        System.out.println();
    }
}
