import java.util.Scanner;
public class Circle
	{
		public static void main(String[]args)
		{
			double radius;
			double area;
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("Enter the radius of the circle:");
			radius = inputs.nextDouble();
			
			print(calcArea(radius), radius);
		}
		
		public static double calcArea(double r)
		{
			return 3.14159 * r * r;
		}
		
		public static void print(double area, double radius)
		{
			System.out.printf("The area of a circle with a radius of " + radius + " is %5.5f", area);
		}
	}