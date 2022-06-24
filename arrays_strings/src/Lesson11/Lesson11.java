/*
    https://www.youtube.com/watch?v=1TyyxCc0Q2o&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=21

    Program to demonstrate comparing strings

    Implemented and pushed in IntelliJ
 */
package arrays_strings.src.Lesson11;

public class Lesson11
{
    public static void main(String[] args)
    {
        String str1 = "Apples are my favorite fruit";
        String str2 = "Apricots are delicious";
        String str3 = "Insects are gross";

        System.out.println(str1);
        System.out.println(str2);

        if(str1.compareTo(str2) > 0) System.out.println("Str1 comes after Str2");
        if(str1.compareTo(str2) < 0) System.out.println("Str1 comes before Str2");
        if(str1.compareTo(str2) == 0) System.out.println("Str1 is equal to Str2");

        System.out.println();
        if(str3.compareTo(str2) > 0) System.out.println("Str1 comes after Str2");
        if(str3.compareTo(str2) < 0) System.out.println("Str1 comes before Str2");
        if(str3.compareTo(str2) == 0) System.out.println("Str1 is equal to Str2");

    } // end main()

} // end Lesson11 class
