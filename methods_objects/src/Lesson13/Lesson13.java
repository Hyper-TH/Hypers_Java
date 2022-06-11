package methods_objects.src.Lesson13;

/*
    https://www.youtube.com/watch?v=psL2NHg8eQs

    Program to demonstrate Public and Private Access Modifiers

    Implemented in IntelliJ
    Pushed in VSC
*/

public class Lesson13
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

        cessna172.setPassengers(5);

    }  // end main()

} // end Lesson13 class


class Aircraft
{
    // By default, these variables are public
    // Meaning these variables can be accessed by this class and other classes
    // If it's private, then it's only accessed by its local scope
    // You would want to make it private for error checking
    private int passengers;         // number of people
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

    void setPassengers(int p)
    {
        if ((p > 0) && (p <= 10))
        {
            passengers = p;
            System.out.println("Revised passenger count: " + passengers);
        }
        else
        {
            System.out.println("Error setting passengers.");
        }

    } // end setPassengers()

} // end Aircraft class