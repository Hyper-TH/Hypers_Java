/*
    https://www.youtube.com/watch?v=ih0wQ1nBkTA
*/
package methods.src;

public class Lesson2 
{
    public static void main(String[] args) 
    {
        int num1 = 7;
        int num2 = 7;

        int answer1;
        int answer2;
        boolean answer3;

        answer1 = multNumbers(num1);
        System.out.println("When we multiply num1 by 7: " + answer1);
        // System.out.println("The result is: " + multNumbers(num1));
        
        answer2 = addNumbers(num1, num2);
        System.out.println("\nWhen we add num1 and num2: " + answer2);
        
        answer3 = equalNumbers(num1, num2);
        System.out.println("\nnum1 and num2 are equal: " + answer3);

    } // end main()   

    
    // Declare method
    // Integer - int
    // Floats - double
    // Booleans - boolean 
    public static int multNumbers(int a)
    {
        int ans = a * 7;

        return ans;

        // or
        // return (a * 7);
    } // end multNumbers()


    public static int addNumbers(int x, int y)
    {
        int ans = x + y;

        return ans;

        // or
        // return (x + y);
    } // end addNumbers()

    public static boolean equalNumbers(int r, int t)
    {
        if (r == t) return true;
        
        else return false;

    } // end equal Numbers()

} // end Lesson2 class

 