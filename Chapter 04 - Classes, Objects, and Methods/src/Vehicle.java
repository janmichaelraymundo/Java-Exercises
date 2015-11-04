class Vehicle
{
    int passengers; // number of passengers

    int fuelcap; // fuel capacity in gallons

    int mpg; // fuel consumption in miles per gallon

    public Vehicle( int p, int f, int m )
    {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    public Vehicle()
    {
        passengers = 0;
        fuelcap = 0;
        mpg = 0;
    }

    public int range()
    {
        return fuelcap * mpg;
    }

    double fuelNeeded( int miles )
    {
        return ( double ) miles / mpg;
    }
}
