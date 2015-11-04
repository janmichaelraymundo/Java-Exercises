import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Display a text file.
 * 
 * To use this program, specify the name of the file that you want to see. For
 * example, to see a file called TEST.TXT, use the following command line.
 * 
 * java ShowFile TEST.TXT
 */
public class ShowFile
{
    public static void main( String[] args )
    {
        int i;
        FileInputStream fin;

        System.out.println( "Filename: " + args[0] );

        // First, make sure that a file has been specified.
        if( args.length != 1 )
        {
            System.out.println( "Usage: ShowFile File" );
            return;
        }

        try
        {
            fin = new FileInputStream( args[0] );
        }
        catch( FileNotFoundException e )
        {
            System.out.println( "File Not Found" );
            return;
        }

        try
        {
            do
            {
                i = fin.read();
                if( i != -1 ) System.out.print( ( char ) i );
            }
            while( i != -1 );
        }
        catch( IOException e )
        {
            System.out.println( "Error reading file." );
        }

        try
        {
            fin.close();
        }
        catch( IOException e )
        {
            System.out.println( "Error closing file." );
        }
    }
}
