public class MyOldThread implements Runnable
{
    String myThreadName;

    public MyOldThread( String name )
    {
        myThreadName = name;
    }

    @Override
    public void run()
    {
        System.out.println( myThreadName + " starting." );
        try
        {
            for( int count = 0; count < 10; count++ )
            {
                Thread.sleep( 400 );
                System.out.println( "In " + myThreadName + ", count is " + count );
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( myThreadName + " interrupted." );
        }
        System.out.println( myThreadName + " terminating." );
    }

}
