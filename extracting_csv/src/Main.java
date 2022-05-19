package extracting_csv.src;

public class Main 
{
    public void food()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new FoodList());
    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
		main.food();        
    }
}
