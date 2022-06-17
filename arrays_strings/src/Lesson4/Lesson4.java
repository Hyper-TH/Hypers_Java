/*
    https://www.youtube.com/watch?v=GJb18H_w8U8&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=7

    Program to demonstrate 2D arrays

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson4;

public class Lesson4
{
    public static void main(String[] args)
    {
        /*
            2   4   8   4
            11  12  9   5
            10  3   2   -2
         */

        int[][] table = new int[3][4];

        table[0][0] = 2;
        table[0][1] = 4;
        table[0][2] = 8;
        table[0][3] = 4;

        table[1][0] = 11;
        table[1][1] = 12;
        table[1][2] = 9;
        table[1][3] = 5;

        table[2][0] = 10;
        table[2][1] = 3;
        table[2][2] = 2;
        table[2][3] = -2;


        // Nested advanced for-loop for 2D arrays
        for (int[] array : table)
        {
            for (int n : array)
            {
                System.out.println(n);
            } // end inner for

        } // end outer for

    } // end main()

} // end Lesson4 class
