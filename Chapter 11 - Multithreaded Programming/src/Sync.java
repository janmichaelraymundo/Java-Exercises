public class Sync
{
    public static void main( String[] args )
    {
        int a[] = { 1, 2, 3, 4, 5 };

        MySumThread mt1 = new MySumThread( "Child #1", a );
        MySumThread mt2 = new MySumThread( "Child #2", a );

        try
        {
            mt1.join();
            mt2.join();
        }
        catch( InterruptedException e )
        {
            System.out.println( "Main thread interrupted." );
        }
    }
}
