package strings.src;

public class StringMethods 
{
    public static void main(String[] args)
    {
        String name = "Hyper Max GB";

        System.out.println("Name: " + name);

        System.out.println("Upper case: " + name.toUpperCase());
        System.out.println("Lower case: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
		System.out.println("Last character: " + name.charAt(11));
		System.out.println("Last name: " + name.substring(10, 12)); // Last index: 11

        name.toLowerCase();
        System.out.println(name);
    } // end main()          

} // end StringMethods class
