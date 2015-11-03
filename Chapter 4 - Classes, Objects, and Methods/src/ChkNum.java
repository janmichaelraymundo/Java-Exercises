public class ChkNum
{
    boolean isEven(int x)
    {
        Factor factor = new Factor();
        return factor.isFactor(x, 2);
    }
}
