import java.util.Scanner;
public class Rectangle
	{	
		public static void main(String[]args)
		{
			double length;
			double width;
			double perimeter;
			
			Scanner input = new Scanner(System.in);
	
			System.out.println("Enter the length of the rectangle:");
			length = input.nextDouble();
			System.out.println("Enter the width of the rectangle:");
			width = input.nextDouble();
			
			print(calcPerim(length, width));
		}
		
		public static double calcPerim(double l, double w)
		{
			return 2 * (l + w);
		}
		
		public static void print(double p)
		{
			System.out.printf("The perimeter of the rectangle is %5.5f", p);
		}
	}