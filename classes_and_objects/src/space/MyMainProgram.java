/*
    MAIN CLASS

This is where objects are initialized and
methods from other classes are called

Last edit: 16 / 05 / 2022
*/

// Packages are used to group related classes
// Think of it as a folder in a file directory
// We use it to avoid name conflicts, and to 
// write a better, maintainable code
package classes_and_objects.src.space;

// The import statement can be used to import an entire package or sometimes 
// import certain classes and interfaces inside the package
// Declare a java class to use in the code below the
// import statement. Once a Java class is declared, then the class
// name can be used in the code without specifiyng the 
// package the class belongs to
// import ie.tudublin.*

public class MyMainProgram 
{
    /* MAIN METHOD */
    // create main method (main entry point) within the app
    // static allows main() to be called without 
    // having to instantiate a particular instance
    // of the class
    public static void main(String[] args) 
    {
        // SpaceShip spaceShip = new SpaceShip("Round", "Hyper", 78);

        // Default constructor
        // new SpaceShip();
        // new SpaceShip();

        // System.out.println(SpaceShip.greetingMessage);

        // SpaceShip.greetingMessage = "Good morning world";
        // System.out.println(SpaceShip.greetingMessage);

        // SpaceShip.greetingMessage = "Good evening world";
        // System.out.println(SpaceShip.greetingMessage);

        // spaceShip.flyAround();
        // SpaceShip.greeting();

        // HugeSpaceShip hugeSpaceShip = new HugeSpaceShip(
        // "round",
        // "Mike",
        // 77,
        // 100,
        // "Tomatoes");
        // System.out.println(hugeSpaceShip.toString());
        // hugeSpaceShip.takeOff();
        // hugeSpaceShip.land();
        // hugeSpaceShip.flyAround();

        // Bird bird = new Bird();
        // bird.takeOff();
        // bird.land();

        // This is not allowed
        // FlyingObject flyingObject = new FlyingObject();

        // This is allowed
        // FlyingObject flyingObject = new Bird();

        // HugeSpaceShip.Cargo apples = new HugeSpaceShip.Cargo("Apples", 299);

        // HugeSpaceShip hugeSpaceShip = new HugeSpaceShip("Round", 55, 1500, new
        // HugeSpaceShip.Cargo("Coconuts", 10));

        HugeSpaceShip hugeSpaceShip = new HugeSpaceShip(SpaceShipType.ROUND, 55, 1500,
                new HugeSpaceShip.Cargo("Coconuts", 10));
        hugeSpaceShip.flyAround();
        // HugeSpaceShip.Captain captain = hugeSpaceShip.new Captain("Mike");
        // captain.giveStatus();

        // hugeSpaceShip.practiceShoot();

        // Anonymous class
        // LazerShooter cowbow new LazerShooter() {
        // @Override
        // public void practiceShoot() {
        // System.out.println("ratatatatatata");
        // }
        // };
        // cowbow.practiceShoot();


        /* LAMBDA */
        // Implementation of an interface with one method
        LazerShooter cowbowFriend = () -> 
        {
            System.out.println("Swinging the lazer pistol");
            System.out.println("Jumping around");
            System.out.println("Shoot at empty bean can");
        };
        // or
        LazerShooter cowbowFriend2 = () -> System.out.println("Swinging the lazerpistol");


        cowbowFriend.practiceShoot();
        cowbowFriend2.practiceShoot();


        /* SWITCH */
        switch (hugeSpaceShip.getModel()) 
        {
            case ROUND -> 
            {
                System.out.println("Wow its round");
            }
            case PYRAMID -> 
            {
                System.out.println("Wow its a pyramid");
            }
            case COOL -> 
            {
                System.out.println("Wow its cool");
            }
            case FAST -> 
            {
                System.out.println("Wow its fast");
            }
            case SLOW -> 
            {
                System.out.println("Wow its slow");
            }

        } // end switch()

    } // end main()

} // edit Main()