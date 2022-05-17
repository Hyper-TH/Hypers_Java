package arrayList.src;

import java.util.ArrayList;

public class ArrayListClass2 
{
    public static void main(String[] args)
    {
        // ArrayList = a resizable array
        //             elements can be added / removed after compilation phase
        //             store reference data types


        // Create an array list that stores strings (indicated in the wrapper class)
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
  
        food.set(0, "sushi");

        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++) 
        {
            System.out.println(food.get(i));
        } // end for
    
    } // end main()    

} // end ArrayListClass2
