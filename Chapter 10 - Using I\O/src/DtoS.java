import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS
{
    public static void main( String[] args )
    {
        String s;

        // Create and use a FileReader wrapped in a BufferedReader.
        try( BufferedReader br = new BufferedReader( new FileReader(
                "/home/janmichaelraymundo/workspace/Java Exercises/Chapter 10 - Using I\\O/test.txt" ) ) )
        {
            while( ( s = br.readLine() ) != null )
            {
                System.out.println( s );
            }
        }
        catch( IOException e )
        {
            System.out.println( "I/O Error: " + e );
        }
    }
}
