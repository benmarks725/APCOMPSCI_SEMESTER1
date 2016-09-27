import java.util.Scanner;

public class Exercise_01
{
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);

        double length = 0.0;
        double width = 0.0;
        double perim = 0.0;

        System.out.print("Enter the length: ");
        length = kb.nextDouble();

        System.out.print("Enter the width: ");
        width = kb.nextDouble();

        perim = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is " + perim);

     }
}