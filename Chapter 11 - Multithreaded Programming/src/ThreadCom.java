public class ThreadCom
{
    public static void main( String[] args )
    {
        TickTock tt = new TickTock();
        MyClockThread mt1 = new MyClockThread( "Tick", tt );
        MyClockThread mt2 = new MyClockThread( "Tock", tt );

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
