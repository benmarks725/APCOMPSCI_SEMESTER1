import java.util.Scanner;
public class Average
	{
		
	
		public static void main(String[]args)
		{
			double num1;
			double num2;
			double num3;
			double average;
			Scanner input = new Scanner(System.in);
	
			System.out.println("Enter the first number");
			num1 = input.nextDouble();
			System.out.println("Enter the second number");
			num2 = input.nextDouble();
			System.out.println("Enter the third number");
			num3 = input.nextDouble();
			
			print(calcAverage(num1, num2, num3), num1, num2, num3);
		}
		
		public static double calcAverage(double n1, double n2, double n3)
		{
			return (n1 + n2 + n3)/3;
		}
		
		public static void print(double avg, double num1, double num2, double num3)
		{
			System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %5.5f", avg);
		}
	}