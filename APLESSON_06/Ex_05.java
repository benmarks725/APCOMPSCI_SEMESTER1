import java.util.Scanner;

public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number to count up to:");
		
		int cUp = kb.nextInt();
		
		System.out.println("Enter the number to count up by:");
		
		int cBy = kb.nextInt();
		
		for (int d = cBy; d<= cUp; d += cBy)
		{
			System.out.println(d);
		}
	}
}