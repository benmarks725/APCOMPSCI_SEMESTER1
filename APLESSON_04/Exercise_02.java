import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;
		double num3 = 0.0;
        double avg = 0.0;

        System.out.print("Enter the num1: ");
        num1 = kb.nextDouble();

        System.out.print("Enter the num2: ");
        num2 = kb.nextDouble();
		
		System.out.print("Enter the num3: ");
        num3 = kb.nextDouble();

        avg = (num1 + num2+num3)/3;

        System.out.println("The average of the numbers is " + avg);

     }
}