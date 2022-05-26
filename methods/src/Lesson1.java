/*
    https://www.youtube.com/watch?v=ejI4iHiumrg
*/

package methods.src;

public class Lesson1 
{
    // Method / Subroutine
    public static void main(String[] args)
    {
        System.out.println("Program start. \n");
        
        // Call method(s)
        printFirstName();
        printFavoriteFood();
        addNames();

        System.out.println("Program end. \n");

    } // end main()

    // void return nothing
    public static void printFirstName()
    {
        System.out.println("My first name is Hyper. \n");
        System.out.println("My last name is Max. \n");
        
    } // end printFirstName()
    
    
    public static void printFavoriteFood()
    {
        System.out.println("My favorite food is Pizza. \n");

    } // end printFavoriteFood()

    public static void addNames()
    {
        // These variables are created
        // But only in the scope of addNames()
        int jason = 5;
        int gibson = 6;
        int sum;

        sum = jason + gibson;

        System.out.println("The number of letters in the name is: " + sum + "\n");
    
    } // end addNames()

} // end Lesson1 class
