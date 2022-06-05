/*
    https://www.youtube.com/watch?v=mx2jna-MrSs

    Program to demonstrate Garbage Collection

    Implemented in IntelliJ
    Pushed in VSC

    Watch video, no coding involved. There's no way to
    free up memory in Java
 */
package methods_objects.src;

public class Lesson11
{
    public static void main(String[] args)
    {
        Aircraft cessna172 = new Aircraft(4, 140, 56.5, 9.5);
        Aircraft piperSaratoga = new Aircraft(6, 201, 102.5, 20.5);

        System.out.println("For Cessna172 to fly for 2.5 hours, it takes "
                + cessna172.fuelNeeded(2.5)
                + " gallons of fuel");

        System.out.println("For Piper to fly for 4.2 hours, it takes "
                + piperSaratoga.fuelNeeded(4.2)
                + " gallons of fuel");

    } // end main()

} // end Lesson11

class Aircraft
{
    int passengers;         // number of people
    int cruiseSpeed;        // miles per hour
    double fuelCapacity;    // gallons
    double fuelBurnRate;    // gallons per hour

    // Constructor
    Aircraft(int p, int c, double fc, double fbr)
    {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    } // end Aircraft()

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