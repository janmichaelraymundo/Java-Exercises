package boockpackext;

import bookpack.Book;

public class UseBook
{
    public static void main( String[] args )
    {
        Book[] books = new Book[5];
        books[0] = new Book( "Java: A beginner's Guide", "Schidlt", 2011 );
        books[1] = new Book( "Java: The Complete References", "Schidlt", 2011 );
        books[2] = new Book( "The Art of Java", "Schidlt and Holmes", 2003 );
        books[3] = new Book( "Red Storm Rising", "Clancy", 1986 );
        books[4] = new Book( "On the Road", "Kerouac", 1955 );

        for( int i = 0; i < books.length; i++ )
        {
            books[i].show();
        }
    }
}
