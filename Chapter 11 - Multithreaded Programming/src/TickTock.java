public class TickTock
{
    String state; // contains the state of the clock

    synchronized void tick( boolean running )
    {
        if( !running )
        {
            // stop the clock
            state = "ticked";
            notify();
            return;
        }

        System.out.print( "Tick " );
        state = "ticked"; // set current state to ticked

        notify(); // let tock() run
        try
        {
            while( !state.equals( "tocked" ) )
            {
                wait(); // wait for tock to complete
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( "Thread interrupted." );
        }
    }

    synchronized void tock( boolean running )
    {
        if( !running )
        {
            // stop the clock
            state = "tocked";
            notify();
            return;
        }

        System.out.println( "Tock " );
        state = "tocked"; // set current state to tocked

        notify(); // let tick() run
        try
        {
            while( !state.equals( "ticked" ) )
            {
                wait(); // wait for tick to complete
            }
        }
        catch( InterruptedException e )
        {
            System.out.println( "Thread interrupted." );
        }
    }
}
