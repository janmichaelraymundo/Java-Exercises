class Vehicle
{
    int passengers; // number of passengers

    int fuelcap; // fuel capacity in gallons

    int mpg; // fuel consumption in miles per gallon

    public void range()
    {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
