
public class VehConsDemo
{
    public static void main( String[] args )
    {
        Vehicle minivan = new Vehicle( 7, 6, 21 );
        Vehicle sportscar = new Vehicle( 2, 14, 12 );
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded( dist );
        System.out.println( "To go " + dist + " miles minivan needs " + gallons + " gallons of fuel." );
        gallons = sportscar.fuelNeeded( dist );
        System.out.println( "To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel." );

    }
}
