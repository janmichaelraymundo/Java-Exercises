public enum TrafficColor
{
    RED( 10 ), YELLOW( 3 ), GREEN( 7 );

    int maxDuration;

    TrafficColor( int x )
    {
        maxDuration = x;
    }

    int getMaxDuration()
    {
        return maxDuration;
    }
}