
public class Suspend
{
    public static void main( String[] args )
    {
        MyStoppableThread ob1 = new MyStoppableThread( "My Thread" );

        try
        {
            Thread.sleep( 1000 ); // let ob1 thread start executing

            ob1.mySuspend();
            System.out.println( "Suspending thread." );
            Thread.sleep( 1000 );

            ob1.myResume();
            System.out.println( "Resuming thread." );
            Thread.sleep( 1000 );

            ob1.mySuspend();
            System.out.println( "Suspending thread." );
            Thread.sleep( 1000 );

            ob1.myResume();
            System.out.println( "Resuming thread." );
            Thread.sleep( 1000 );

            ob1.myStop();
            System.out.println( "Stopping thread." );
            Thread.sleep( 1000 );
        }
        catch( InterruptedException e )
        {
            System.out.println( "Main thread interrupted." );
        }

        // wait for thread to finish
        try
        {
            ob1.join();
        }
        catch( InterruptedException e )
        {
            System.out.println( "Main thread interrupted." );
        }
        System.out.println( "Main thread exiting." );
    }
}
