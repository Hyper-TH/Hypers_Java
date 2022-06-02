/*
    https://www.youtube.com/watch?v=KwyX_iv0FYo
 */
package methods_objects.src;

public class Lesson8
{
    public static void main(String[] args)
    {
        Aircraft_old2 cessna172 = new Aircraft_old2();
        Aircraft_old2 piperSaratoga;
        piperSaratoga = new Aircraft_old2();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("Cessna 172 Endurance is: " + cessna172.calculateEndurance());

        double enduranceSaraToga = piperSaratoga.calculateEndurance();
        System.out.println("\nPiper Saratoga Endurance is: " + enduranceSaraToga);
    } // end main()
} // end Lesson8 class

class Aircraft_old2
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

} // end Aircraft class