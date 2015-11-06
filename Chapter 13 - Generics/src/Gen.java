// A simple generic class. Here, T is a type parameter that will be replaced by
// a real type when an object of type Gen is created.
public class Gen< T >
{
    T ob; // declare an object of type T

    public Gen( T o )
    {
        ob = o;
    }

    public T getOb()
    {
        return ob;
    }

    void showType()
    {
        System.out.println( "Type of T is " + ob.getClass().getName() );
    }
}
