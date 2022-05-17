/*
    CONSTRUCTOR CLASS

    A basic class for a spaceship

Last edit: 17 / 05 / 2022
*/
package classes_and_objects.src.space;

// extends Object (Abstract class)
public class SpaceShip extends FlyingObject 
{
    // private String model;
    // private String captain;
    private SpaceShipType model;
    private Integer fuel;
    public static String greetingMessage = "HelloWorld"; // Variable shared amongst all instances

    /* STATIC INITIIALIZAITION BLOCK */
    // static blocks are automatically called as soon as class is loaded in memory
    // and there is nothing to do as we have to in case of calling methods and
    // constructors inside main()
    static 
    {
        System.out.println("Static init code .... 1");
    }

    /* INSTANCE INTIALIZATION BLOCK / IIB */
    // Can write code blocks that wouldnt be added to all constructors automatically
    // So firstly, constructor is invoked and the java compiler copies the instance
    // initializer block in the constructor after the first statement super(). They
    // run each time when object of the class is created.
    // Initialization blocks are executed whenever the class is initialized and
    // before constructors are invoked.
    // They are typically placed above the constructors within braces.
    // It is not at all necessary to include them in your classes
    {
        System.out.println("We are initializing an instance of the class 1");
    }

    // Override toString() method
    @Override
    public String toString() 
    {
        return "SpaceShip [" +
        // "captain=" + captain + ", " +
                "fuel=" + fuel + ", " +
                "model=" + model +
                "]";
    }

    /* DEFAULT CONSTRUCTOR */
    public SpaceShip() 
    {
        System.out.println("This is the default constructor");
    }

    /* CONSTRUCTOR (to create instance of the variables) */
    // A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created.
    // It can be used to set initial values for object attributes

    // public SpaceShip(String model, String captain, Integer fuel) 
    // {
    //     this.model = model;
    //     this.captain = captain;
    //     this.fuel = fuel;

    //     System.out.println("This is a constructor with all the arguments for each member variable");
    // }

    // public SpaceShip(String model, Integer fuel) {
    public SpaceShip(SpaceShipType model, Integer fuel) 
    {
        this.model = model;
        this.fuel = fuel;

        System.out.println("This is a constructor with all the arguments for each member variable");
    }


    /* METHODS / FUNCTIONS */

    /* MEMBER METHOD */
    // Return nothing (void)
    // Only callable this method on an instance of the spaceship class
    // public void flyAround() {
    // System.out.println("Freakin nyooooom");
    // }
    public void flyAround() 
    {
        // supem.out.println("FREAKIN NYOOOOOOM");
        System.out.println(getModel().getSoundWhenFlying());
    }

    /* STATIC METHOD */
    // Method can be executed and ran without creating an instance of the class
    public static void greeting() {
        System.out.println("Hello this code is run directly from the class");
        System.out.println("We do not need an instance of the class");
    }

    /* STATIC BLOCK */
    // {
    //     System.out.println("Static init code .... 2");
    // }

    /* GETTERS AND SETTERS */
    // To make these public
    // Encapsulation
    // To make it read-only, delete setters

    // public String getModel() {
    // return model;
    // }

    // public void setModel(String model) 
    // {
    //     this.model = model;
    // }

    public SpaceShipType getModel() 
    {
        return model;
    }

    public void setModel(SpaceShipType model) 
    {
        this.model = model;
    }
    // public String getCaptain() 
    // {
    //     return captain;
    // }

    // public void setCaptain(String captain) 
    // {
    //     this.captain = captain;
    // }

    public Integer getFuel() 
    {
        return fuel;
    }

    public void setFuel(Integer fuel) 
    {
        this.fuel = fuel;
    }

    /* END GETTERS AND SETTERS */

    // Override takeOff method from the takeOffClass
    @Override
    public void takeOff() 
    {
        // TODO Auto-generated method stub
        System.out.println("Spaceship is taking off...");

    }

    // {
    // System.out.println("We are initializing an instance of the class 2");
    // }

} // end SpaceShip()
