import java.io.IOException;

public class HelpClassDemo
{
    public static void main( String[] args ) throws IOException
    {
        char choice, ignore;
        Help hlpobj = new Help();
        while( true )
        {
            hlpobj.showMenu();
            choice = ( char ) System.in.read();

            do
            {
                ignore = ( char ) System.in.read();
            }
            while( ignore != '\n' );
            if( choice == 'q' ) break;
            System.out.println( "\n" );
            hlpobj.helpOne( choice );
        }
    }
}
