public class MoreThreads
{
    public static void main( String[] args )
    {
        System.out.println( "Main thread starting." );

        MyThread mt1 = new MyThread( "Child #1" );
        MyThread mt2 = new MyThread( "Child #2" );
        MyThread mt3 = new MyThread( "Child #3" );

        do
        {
            System.out.print( "." );
            try
            {
                Thread.sleep( 100 );
            }
            catch( InterruptedException e )
            {
                System.out.println( "Main thread interrupted." );
            }
        }
        while( mt1.isAlive() || mt2.isAlive() || mt3.isAlive() );
        System.out.println( "Main thread ending." );
    }
}
