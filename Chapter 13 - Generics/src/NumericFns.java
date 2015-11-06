public class NumericFns< T extends Number >
{
    T num;

    public NumericFns( T n )
    {
        num = n;
    }

    double reciprocal()
    {
        return 1 / num.doubleValue();
    }

    double fraction()
    {
        return num.doubleValue() - num.intValue();
    }

    T getNumber()
    {
        return num;
    }

}
