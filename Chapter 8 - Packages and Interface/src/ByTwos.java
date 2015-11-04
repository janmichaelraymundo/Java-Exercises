public class ByTwos implements Series
{
    int start;

    int val;

    int prev;

    public ByTwos()
    {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext()
    {
        val += 2;
        return val;
    }

    @Override
    public void reset()
    {
        val = start;
    }

    @Override
    public void setStart( int x )
    {
        start = x;
        val = x;
        prev = -2;
    }

    public int getPrevious()
    {
        return prev;
    }

}
