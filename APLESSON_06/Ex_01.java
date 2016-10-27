import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		
		String bop = kb.nextLine();
		
		int pob = bop.length();
		
		
		for (int i = 1; i <= pob; i++)
		{
			System.out.println(bop);
		}
	}
}