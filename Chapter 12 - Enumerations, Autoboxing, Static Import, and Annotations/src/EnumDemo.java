public class EnumDemo
{
    enum Transport
    {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void main( String[] args )
    {
        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println( "Value of tp: " + tp );
        System.out.println();

        tp = Transport.TRAIN;

        // Compare two enum values
        if( tp == Transport.TRAIN ) System.out.println( "tp contains " + tp + ".\n" );

        // Use an enum to control switch statement.
        switch( tp )
        {
            case CAR:
                System.out.println( "A car carries people." );
                break;
            case TRUCK:
                System.out.println( "A truck carries freight." );
                break;
            case AIRPLANE:
                System.out.println( "An airplane flies." );
                break;
            case TRAIN:
                System.out.println( "A train runs on rails." );
                break;
            case BOAT:
                System.out.println( "A boat sails on water." );
                break;
        }
    }
}
