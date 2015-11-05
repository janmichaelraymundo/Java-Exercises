public class MyThread implements Runnable
{
    Thread myThread;

    public MyThread( String name )
    {
        myThread = new Thread( this, name );
        myThread.start();
    }

    public boolean isAlive()
    {
        return myThread.isAlive();
    }

    public void join() throws InterruptedException
    {
        myThread.join();
    }

    @Override
    public void run()
    {
        System.out.println( myThread.getName() + " starting." );
        try
        {
            for( int count = 0; count < 10; count++ )
            {
                Thread.sleep( 400 );
                System.out.println( "In " + myThread.getName() + ", count is " + count );
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( myThread.getName() + " interrupted." );
        }
        System.out.println( myThread.getName() + " terminating." );
    }

    public String getName()
    {
        return myThread.getName();
    }

}
