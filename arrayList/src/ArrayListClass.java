package arrayList.src;

import java.util.ArrayList;

public class ArrayListClass 
{
    public static void main(String[] args) 
    {
        //  Array
        String[] fruits = new String[3]; // You would have to know the exact size

        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        // fruits[3] = "Watermelon";
        System.out.println(fruits); // This prints gibberish and not the entire array


        
        // ArrayList
        ArrayList fruitList = new ArrayList(); // Flexible

        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");

        fruitList.remove("Strawberry");
        fruitList.clear();
        System.out.println(fruitList.contains("Raspberry")); // Returns either true or false

        System.out.print(fruitList); // This prints the entire array

    } // end main()

} // end ArrayList
