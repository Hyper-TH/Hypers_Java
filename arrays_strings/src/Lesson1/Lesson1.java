/*
    https://www.youtube.com/watch?v=2eKjuhzI87g&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=1

    Program to demonstrate declaring arrays & accessing elements

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson1;

public class Lesson1
{
    public static void main(String[] args)
    {
        // int ages[] = new int[5];             // C-style
        int[] ages = new int[5];                // Much more ideal to declare an array
        // int ages[] = {4, 5, 3, 7};          // Problem with this is that size is not initialized
        double[] heights = new double[5];

//        System.out.println("The first element is: " + ages[0]);   // Prints 0
//        System.out.println("The second element is: " + ages[1]);  // Prints 0

        ages[0] = 4;
        ages[1] = 5;
        ages[2] = 3;
        ages[3] = 5;
        ages[4] = 7;
//        ages[5] = 5;  // Out of bounds exception

        heights[0] = 4.7;
        heights[1] = 3.7;
        heights[2] = 6.5;
        heights[3] = 2.9;
        heights[4] = 4.0;



        System.out.println("The first child's height is: " + heights[0]);
        System.out.println("The second child's height is: " + heights[1]);
        System.out.println("The third child's height is: " + heights[2]);
        System.out.println("The fourth child's height is: " + heights[3]);
        System.out.println("The fifth child's height is: " + heights[4]);
//        System.out.println("The x child's height is: " + heights[11]);  // Out of bounds exception

        System.out.println("The first child's age is: " + ages[0]);
        System.out.println("The second child's age is: " + ages[1]);
        System.out.println("The third child's age is: " + ages[2]);
        System.out.println("The fourth child's age is: " + ages[3]);
        System.out.println("The fifth child's age is: " + ages[4]);

    } // end main()
} // end Lesson1 class
