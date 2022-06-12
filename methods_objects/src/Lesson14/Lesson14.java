/*
    https://www.youtube.com/watch?v=SONcY0UaArI

    Program to demonstrate the static keyword

    Implemented in IntelliJ
    Pushed in VSC
 */
package methods_objects.src.Lesson14;

public class Lesson14
{
    public static void main(String[] args)
    {
        /*
            You can also instantiate the static variable
            and be able to use it even before any instances are created
        */
        // Aircraft.wings = 2;

        Aircraft cessna172 = new Aircraft(4, 140, 56.5, 9.5);
        Aircraft piperSaratoga = new Aircraft(6, 201, 102.5, 20.5);

        System.out.println("For Cessna172 to fly for 2.5 hours, it takes "
                + cessna172.fuelNeeded(2.5)
                + " gallons of fuel");

        System.out.println("For Piper to fly for 4.2 hours, it takes "
                + piperSaratoga.fuelNeeded(4.2)
                + " gallons of fuel");

        cessna172.setPassengers(5);

        // Reference the class name
        Aircraft.wings = 2;     // This will apply to all instances of that class
        System.out.println("All of my aircraft has " + Aircraft.wings + " wings");

//        System.out.println(cessna172.wings);
//        System.out.println(piperSaratoga.wings);

    } // end main()

} // end Lesson14 class

class Aircraft
{
    /*
        When a variable is set to static two things happen:
        - That variable can be interfaced with, without even declaring an object
        - Kind of behaves as a global variable
        - If that variable is applicable to every instance of that class, then call it static
     */
    private int passengers;         // number of people
    int cruiseSpeed;        // miles per hour
    static double fuelCapacity;    // gallons
    static double fuelBurnRate;    // gallons per hour
    static int wings;       // Unchanging, two wings for all aircraft

    // Constructor
    Aircraft(int p, int c, double fc, double fbr)
    {
        this.passengers = p;
        this.cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    } // end Aircraft()

    // Method to calculate aircraft endurance
    // Able to use the method by just calling the class
    static double calculateEndurance()
    {
        double endurance;

        // endurance = fuelCapacity / fuelBurnRate;
        endurance = fuelCapacity / fuelBurnRate;

        return endurance;
    }  // end calculateEndurance();

    double fuelNeeded(double time)
    {
        // Use the value associated with THIS object
        return fuelBurnRate * time;
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