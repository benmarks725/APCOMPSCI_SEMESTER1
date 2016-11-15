import java.util.Scanner;

public class Exercise_02
{
	    static double num1 = 0.0;
        static double num2 = 0.0;
		static double num3 = 0.0;
        static double avg = 0.0;
		
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
		
        System.out.print("Enter the num1: ");
        num1 = kb.nextDouble();

        System.out.print("Enter the num2: ");
        num2 = kb.nextDouble();
		
		System.out.print("Enter the num3: ");
        num3 = kb.nextDouble();
		print();
    }
	 public static void print()
	{
		average();
		System.out.println("The average of the numbers is " + avg);
	}
	public static void average()
	{
		avg = (num1+num2+num3)/3;
	}
}