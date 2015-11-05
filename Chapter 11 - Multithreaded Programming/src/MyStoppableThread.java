// Suspending, resuming, and stopping a thread.
public class MyStoppableThread extends Thread
{
    boolean suspended;

    boolean stopped;

    public MyStoppableThread( String name )
    {
        super( name );
        suspended = false;
        stopped = false;
        start();
    }

    @Override
    public void run()
    {
        System.out.println( getName() + " starting." );
        try
        {
            for( int i = 1; i < 1000; i++ )
            {
                System.out.print( i + " " );
                if( i % 10 == 0 )
                {
                    System.out.println();
                    sleep( 250 );
                }

                // Use sychronized block to check suspended and stopped.
                synchronized( this )
                {
                    while( suspended )
                    {
                        wait();
                    }
                    if( stopped ) break;
                }
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( getName() + " interrupted." );
        }
        System.out.println( getName() + " exiting." );
    }

    // Stop the thread.
    synchronized void myStop()
    {
        stopped = true;
        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notify();
    }

    // Suspend the thread.
    synchronized void mySuspend()
    {
        suspended = true;
    }

    // Resume the thread.
    synchronized void myResume()
    {
        suspended = false;
        notify();
    }
}
