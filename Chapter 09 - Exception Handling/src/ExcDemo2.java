public class ExcDemo2
{
    public static void main( String[] args )
    {
        try
        {
            ExcTest.genException();
        }
        catch( ArrayIndexOutOfBoundsException e )
        {
            System.out.println( "Index out-of-bounds!" );
        }
        System.out.println( "After catch statement." );
    }
}
