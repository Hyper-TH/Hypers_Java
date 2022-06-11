/*
    4: https://www.youtube.com/watch?v=4xKihjI6HJ0
    5: https://www.youtube.com/watch?v=q4vknQYjHy8
    6: https://www.youtube.com/watch?v=4mMX7KeyTBg
    7: https://www.youtube.com/watch?v=Q0QgLNd2fsA

    Program to demonstrate
    - Defining a class and creating objects
    - Storing and accessing instance variables of an object
    - Calculations with instance variables of an object#
    - Adding a method to a class

    Implemented in IntelliJ
    Pushed in VSC
 */

package methods_objects.src.Lesson4_7;

public class Lesson4_7
{
    public static void main(String[] args)
    {
        // Type Name = new Type
        Aircraft_old cessna172 = new Aircraft_old();        // create object of class aircraft

        // Aircraft piperSaratoga = new Aircraft();
        Aircraft_old piperSaratoga;
        piperSaratoga = new Aircraft_old();

//        double cessna172Endurance;  // How long can it stay in the air
//        double piperEndurance;  // How long can it stay in the air

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

//        System.out.println("Cessna 172 passengers: " + cessna172.passengers);
//        System.out.println("Cessna 172 Fuel Burn Rate: " + cessna172.fuelBurnRate + "gph");

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

//        System.out.println("\nPiper Saratoga Cruise Speed: " + piperSaratoga.cruiseSpeed + "mph");

//        cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
//        System.out.println("A Cessna 172 can stay aloft for: " + cessna172Endurance + " hours.");

//        piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
//        System.out.println("A Piper Saratoga can stay aloft for: " + piperEndurance + " hours.");

        System.out.println("Cessna 172");
        cessna172.calculateEndurance();     // Find in memory the method related to this object's class

        System.out.println("\nPiper Saratoga");
        piperSaratoga.calculateEndurance();

    } // end main()

} // end Lesson4_7 class


class Aircraft_old
{
    int passengers;         // number of people
    int cruiseSpeed;        // miles per hour
    double fuelCapacity;    // gallons
    double fuelBurnRate;    // gallons per hour

    // Method to calculate aircraft endurance
    void calculateEndurance()
    {
        double endurance;   // This is local to class Aircraft

        endurance = fuelCapacity / fuelBurnRate;

        System.out.println("The endurance is " + endurance + " hours");
    }  // end calculateEndurance();

} // end Aircraft class