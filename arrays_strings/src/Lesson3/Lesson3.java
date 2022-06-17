/*
    https://www.youtube.com/watch?v=rxJRJV3eEaI&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=6

    Program to demonstrate searching for max and min of an array

    Implemented in IntelliJ
    Pushed in VSC
 */

package arrays_strings.src.Lesson3;

public class Lesson3
{
    public static void main(String[] args)
    {
        int[] largeArray = {8, 11, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54};  // 14 elements

        int smallest = largeArray[0];
        int largest = largeArray[0];

//        for(int i = 0; i <= (largeArray.length - 1); i++)
//        {
//            if(largeArray[i] < smallest)
//            {
//                smallest = largeArray[i];
//            } // end if
//
//            if(largeArray[i] > largest)
//            {
//                largest = largeArray[i];
//            } // end if
//
//
//        } // end for

        // Advanced for loop
        for (int n: largeArray)
        {
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;
        } // end advanced for loop

        System.out.println("The smallest value in the Array is: " + smallest);
        System.out.println("The largest value in the Array is: " + largest);


    } // end main()

} // end Lesson3 class
