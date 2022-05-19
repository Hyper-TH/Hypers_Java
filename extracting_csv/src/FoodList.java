package extracting_csv.src;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.*;
import processing.data.TableRow;

public class FoodList extends PApplet
{

    ArrayList<Food> foods = new ArrayList<Food>();

    void loadData()
    {
        Table table = loadTable("foodList.csv", "header");
        
        for(TableRow row:table.rows())
        {
            Food food = new Food(row);
            foods.add(food);
        }
    } // end loadData()

    void listData()
    {
        for(Food food:foods)
        {
            println(food);
        }
    } // end listData()


} // end FoodList class
