public class Priority implements Runnable
{
    private int myCount;

    private Thread myThread;

    static boolean stop = false;

    static String currentName;

    /*
     * Construsct a new thread. Notice that this constructor does not actually
     * start the threads running.
     */
    public Priority( String name )
    {
        myThread = new Thread( this, name );
        myCount = 0;
        currentName = name;
    }

    // Begin execution of new thread.
    @Override
    public void run()
    {
        System.out.println( myThread.getName() + " starting." );
        do
        {
            myCount++;
            if( currentName.compareTo( myThread.getName() ) != 0 )
            {
                currentName = myThread.getName();
                System.out.println( "In " + currentName );
            }
        }
        while( !stop && myCount < 10000000 );
        stop = true;

        System.out.println( "\n" + myThread.getName() + " terminating." );
    }

    public void setPriority( int newPriority )
    {
        myThread.setPriority( newPriority );
    }

    public void start()
    {
        myThread.start();
    }

    public void join() throws InterruptedException
    {
        myThread.join();
    }

    public int getCount()
    {
        return myCount;
    }

}
