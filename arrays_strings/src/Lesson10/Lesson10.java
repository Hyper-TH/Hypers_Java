/*
    https://www.youtube.com/watch?v=wnSYUNtfpcE&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=19

    Program to demonstrate if two strings are equal

    Implemented and pushed in IntelliJ
 */
package arrays_strings.src.Lesson10;

public class Lesson10
{
    public static void main(String[] args)
    {
        String fullName = "Hyper Max GB";
        String userInput = "hyper max gb";

        System.out.println(fullName + "\n" + userInput + "\n");
        System.out.println("Are these strings equal? " + fullName.equals(userInput) + "\n");
        System.out.println(fullName.equals("I love pizza."));

    } // end main()

} // end Lesson10 class
