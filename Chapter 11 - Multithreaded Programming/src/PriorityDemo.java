public class PriorityDemo
{
    public static void main( String[] args )
    {
        Priority mt1 = new Priority( "High Priority" );
        Priority mt2 = new Priority( "Low Priority" );

        // set the priorities

        mt1.setPriority( Thread.NORM_PRIORITY + 2 );
        mt2.setPriority( Thread.NORM_PRIORITY - 2 );

        mt1.start();
        mt2.start();

        try
        {
            mt1.join();
            mt2.join();
        }
        catch( InterruptedException e )
        {
            System.out.println( "Main thread interrupted." );
        }
        System.out.println( "\nHigh priority thread counted to " + mt1.getCount() );
        System.out.println( "\nLow priority thread counted to " + mt2.getCount() );
    }
}
