public class MySumThread implements Runnable
{
    Thread myThread;

    static SumArray sa = new SumArray();

    int a[];

    int answer;

    // Construct a new thread.
    public MySumThread( String name, int nums[] )
    {
        myThread = new Thread( this, name );
        a = nums;
        myThread.start(); // start the thread
    }

    // Begin execution of new thread
    @Override
    public void run()
    {
        int sum;
        System.out.println( myThread.getName() + " is starting." );

        synchronized( sa )
        {
            answer = sa.sumArray( a );
        }
        System.out.println( "Sum for " + myThread.getName() + " is " + answer );
        System.out.println( myThread.getName() + " terminating." );
    }

    public void join() throws InterruptedException
    {
        myThread.join();
    }

}
