// Use a custom exception
public class NonIntResultException extends Exception
{
    int n;

    int d;

    public NonIntResultException( int i, int j )
    {
        n = i;
        d = j;
    }

    public String toString()
    {
        return "Result of " + n + " / " + d + " is a non-integer.";
    }
}
