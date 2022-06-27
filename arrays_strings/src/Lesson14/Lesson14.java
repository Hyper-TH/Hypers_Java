/*
    https://www.youtube.com/watch?v=wDEPV23EmeA&list=PLnVYEpTNGNtU6TSAVSv_Kw7pyBbYrTFQV&index=27

    Program to demonstrate arrays of strings

    Implemented and pushed in IntelliJ
*/
package arrays_strings.src.Lesson14;

public class Lesson14
{
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 7, 5};
        String[] array2 = new String[3];
        String[] sentence = {"I", "love", "to eat", "in a", "restaurant."};

        System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);
        sentence[4] = "sushi place.";
        System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);

        array2[0] = "Modernized_Hyper";
        array2[1] = "Settle down and think";
        array2[2] = "Daydreaming_Hyper";
        // array2[3] = "She do be fine";

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
    } // end main()

} // end Lesson14 class
