/*
    https://www.youtube.com/watch?v=pL0I9nGph7c&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=11

    Program to demonstrate using enhanced for loop with arrays

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson6;

public class Lesson6
{
    public static void main(String[] args)
    {
        int[] jason = {3, 4, 5, 6, 7, 8, 9, 10, 11};

        /*
            for(dataType variable : array)
         */
        for(int element : jason)
        {
            System.out.println(element * element);
        } // end advanced for loop

    } // end main()

} // end Lesson6 class
