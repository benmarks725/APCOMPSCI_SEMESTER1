import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int Num = kb.nextInt();
		
		System.out.println("Enter the size of the table:");
		
		int Table = kb.nextInt();
		
		
		for (int i = 1; i <= Table; i++)
		{	
			System.out.printf("%5d  |  %5d\n", i, i*Num);
		}
	}
}