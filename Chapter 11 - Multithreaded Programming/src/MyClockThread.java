public class MyClockThread implements Runnable
{
    Thread thread;

    TickTock ttOb;

    public MyClockThread( String name, TickTock tt )
    {
        thread = new Thread( this, name );
        ttOb = tt;
        thread.start();
    }

    @Override
    public void run()
    {
        if( thread.getName().compareTo( "Tick" ) == 0 )
        {
            for( int i = 0; i < 5; i++ )
            {
                ttOb.tick( true );
            }
            ttOb.tick( false );
        }
        else
        {
            for( int i = 0; i < 5; i++ )
            {
                ttOb.tock( true );
            }
            ttOb.tock( false );

        }
    }

    public void join() throws InterruptedException
    {
        thread.join();
    }

}
