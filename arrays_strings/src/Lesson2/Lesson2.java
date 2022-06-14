/*
    https://www.youtube.com/watch?v=1KTArjYPMEo&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=4

    Program to demonstrate using a loop to access an array

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson2;

public class Lesson2
{
    public static void main(String[] args)
    {
        double[] grades = { 96.5, 98.7, 99.3, 88.4, 88.6, 99.9};
        double max;
        int i;

        max = grades[0];

        for(i = 0; i <= 5; i++)
        {
            if(grades[i] > max)
            {
                max = grades[i];
            }
        } // end for

        System.out.println("\n\nThe max grade in the class is: " + max);
    } // end main()

} // end Lesson2 class
