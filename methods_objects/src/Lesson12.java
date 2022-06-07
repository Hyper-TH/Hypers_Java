/*
    https://www.youtube.com/watch?v=IJu3rQzyjJs

    Program to demonstrate the "this" keyword

    Implemented in IntelliJ
    Pushed in VSC
 */
package methods_objects.src;

public class Lesson12
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
} // end Lesson12 class

class Aircraft
{
    int passengers;         // number of people
    int cruiseSpeed;        // miles per hour
    double fuelCapacity;    // gallons
    double fuelBurnRate;    // gallons per hour

    // Constructor
    Aircraft(int p, int c, double fc, double fbr)
    {
        this.passengers = p;
        this.cruiseSpeed = c;
        this.fuelCapacity = fc;
        this.fuelBurnRate = fbr;
    } // end Aircraft()

    // Method to calculate aircraft endurance
    double calculateEndurance()
    {
        double endurance;

        // endurance = fuelCapacity / fuelBurnRate;
        endurance = this.fuelCapacity / this.fuelBurnRate;

        return endurance;
    }  // end calculateEndurance();

    double fuelNeeded(double time)
    {
        // Use the value associated with THIS object
        return this.fuelBurnRate * time;
        // return fuelBurnRate * time;
    } // end fuelNeeded()

} // end Aircraft class