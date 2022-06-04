/*
    https://www.youtube.com/watch?v=9BZ8s79jkP0

    Program to demonstrate class methods with parameters

    Implemented in IntelliJ
    Pushed in VSC
 */

package methods_objects.src;

public class Lesson9
{
    public static void main(String[] args)
    {
        Aircraft_old3 cessna172 = new Aircraft_old3();
        Aircraft_old3 piperSaratoga;
        piperSaratoga = new Aircraft_old3();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("For Cessna172 to fly for 2.5 hours, it takes "
                + cessna172.fuelNeeded(2.5)
                + " gallons of fuel");

        System.out.println("For Piper to fly for 4.2 hours, it takes "
                + piperSaratoga.fuelNeeded(4.2)
                + " gallons of fuel");

    } // end main()

} // end Lesson9 class

class Aircraft_old3
{
    int passengers;         // number of people
    int cruiseSpeed;        // miles per hour
    double fuelCapacity;    // gallons
    double fuelBurnRate;    // gallons per hour

    // Method to calculate aircraft endurance
    double calculateEndurance()
    {
        double endurance;

        endurance = fuelCapacity / fuelBurnRate;

        return endurance;
    }  // end calculateEndurance();

    double fuelNeeded(double time)
    {
        return fuelBurnRate * time;
    } // end fuelNeeded()

} // end Aircraft class