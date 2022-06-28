/*
    https://www.youtube.com/watch?v=HP-I_WrODTo&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=31

    Program to demonstrate reading chars into char array

    Implemented and pushed in IntelliJ
 */
package arrays_strings.src.Lesson16;

public class Lesson16
{
    public static void main(String[] args)
    {
        String str = "Hyper Max";

        char[] array = new char[16];

        str.getChars(0, 9, array, 0);

        for (char n: array)
        {
            System.out.println(n);
        } // end for
    } // end main()

} // end Lesson16 class
