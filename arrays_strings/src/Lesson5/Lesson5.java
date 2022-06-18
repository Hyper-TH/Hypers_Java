/*
    https://www.youtube.com/watch?v=Pba2Tpema9Y&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=9

    Program to demonstrate using array length instance variable

    Implemented in IntelliJ
    Pushed in VSC
 */
package arrays_strings.src.Lesson5;

public class Lesson5
{
    public static void main(String[] args)
    {
        int[] jason = {4, 5, 3, 4, 5, 4, 5, 6, 7, 8, 9, 0, 8, 7, 56, 4, 4, 3, 5};

//        System.out.println(jason.length);

        for(int i = 0; i <= jason.length - 1; i++)
        {
            System.out.println(jason[i]);
        } // end for
    } // end main()

} // end Lesson5 class
