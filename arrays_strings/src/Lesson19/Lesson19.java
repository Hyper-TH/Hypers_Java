/*
    https://www.youtube.com/watch?v=szBFTPf1G_Y&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=37

    Program to demonstrate reading a string from the keyboard

    Implemented and pushed in IntelliJ
 */
package arrays_strings.src.Lesson19;

import java.util.Scanner;

public class Lesson19
{
    public static void main(String[] args)
    {
        String pin = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pin: ");

        pin = input.nextLine();

        System.out.println(pin);
    } // end main()

} // end Lesson19 class
