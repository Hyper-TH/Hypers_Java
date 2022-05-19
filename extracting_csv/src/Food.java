package extracting_csv.src;

import processing.data.TableRow;

public class Food
{
    String foodName;
    int quantity;
    String foodType;

    public Food(TableRow row)
    {
        foodName = row.getString("Food Name");
        quantity = row.getInt("Quantity");
        foodType = row.getString("Type");

    } // end Food(TableRow)

    public String toString()
    {
        return foodName + "," + quantity + "," + foodType;
    } // end toString()

} // end Food class
