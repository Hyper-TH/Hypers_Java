/*
    https://www.youtube.com/watch?v=r3DBIDyzLUI&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=13

    Program to demonstrate creating and using strings in java

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson7;

public class Lesson7
{
    public static void main(String[] args)
    {
        // Strings are objects in Java
        String str = new String("I love hamburgers.");
        String jason = new String("I love hot dogs.");

        String str2 = "I like to go to restaurants.";
        String hyper = "My name is Hyper.";

        System.out.println(str + jason + str2);
        System.out.println(hyper);

        System.out.println("Hi." + hyper);

    } // end main()

} // end Lesson7 class
