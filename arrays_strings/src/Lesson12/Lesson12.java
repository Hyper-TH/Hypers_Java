/*
    https://www.youtube.com/watch?v=wE_1ydQVitE&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=23

    Program to demonstrate reading chars from a string

    Implemented and pushed in IntelliJ
 */
package arrays_strings.src.Lesson12;

public class Lesson12
{
    public static void main(String[] args)
    {
        String favoriteMeal = "I really love a good pasta";
        String favoriteDrink = "I love to drink ice tea";
        char hyper;

        System.out.println(favoriteMeal);
        System.out.println(favoriteDrink + "\n");

        hyper = favoriteMeal.charAt(2);
        System.out.println(hyper);
    } // main()

} // end Lesson12 class
