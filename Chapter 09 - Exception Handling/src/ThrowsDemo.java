import java.io.IOException;

// Use throws.
public class ThrowsDemo
{
    public static char prompt( String str ) throws IOException
    {
        System.out.println( str + ": " );
        return ( char ) System.in.read();
    }

    public static void main( String[] args )
    {
        char ch;

        try
        {
            ch = prompt( "Enter a letter" );
        }
        catch( IOException e )
        {
            System.out.println( "I/O exception occurred." );
            ch = 'X';
        }
        System.out.println( "You pressed " + ch );
    }
}
