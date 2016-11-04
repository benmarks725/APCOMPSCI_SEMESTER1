import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		
		String stri = kb.nextLine();
		
		int pob = stri.length();
		
		
		for (int i = 1; i <= pob; i++)
		{
			System.out.println(stri);
		}
	}
}