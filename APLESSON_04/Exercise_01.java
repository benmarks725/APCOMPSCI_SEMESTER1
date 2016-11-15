import java.util.Scanner;

public class Exercise_01
{
	static double length = 0.0;
    static double width = 0.0;
    static double perim = 0.0;
	
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = kb.nextDouble();
        System.out.print("Enter the width: ");
        width = kb.nextDouble();
		calcPerim();
		print();
    }
	public static void calcPerim()
	{
		perim = 2 * (length + width);
	}
	public static void print()
	{
        System.out.println("The perimeter of the rectangle is " + perim);
	}
}