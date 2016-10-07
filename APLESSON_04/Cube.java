import java.util.Scanner;
public class Cube
	{
		public static void main(String[]args)
		{
			double side;
			double SA;
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("Enter the length of a side:");
			side = inputs.nextDouble();
			
			print(calcSA(side), side);
		}
		
		public static double calcSA(double s)
		{
			return 6 * s * s;
		}
		
		public static void print(double sa, double side)
		{
			System.out.printf("The SA or a cube with side lengths " + side + " is %5.5f", sa);
		}
	}