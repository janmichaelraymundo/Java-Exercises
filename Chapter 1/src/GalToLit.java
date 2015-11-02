/*
 * Try This 1-1
 * 
 * This program converts gallons to liters.
 * 
 * Call this program GalToLit.java.
 * 
 */
public class GalToLit
{
    public static void main( String args[] )
    {
        double gallons; // holds number of gallons
        double liters; // holds conversion to liters

        gallons = 10;
        liters = gallons * 3.7854; // convert to liters

        System.out.println( gallons + " gallons is " + liters + " liters." );
    }
}
