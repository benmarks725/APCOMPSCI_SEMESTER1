import java.util.Scanner;

public class Ex_02
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int Numfactorial = kb.nextInt();
		
		System.out.println(calculateFactorial(Numfactorial));
	}
	public static int calculateFactorial(int Numfactorial)
	{
		int d = 1;
		
		for (int i = 1; i <= Numfactorial; i++)
			
		{
			d = d * i;
		}
		
		return d;
	}
}