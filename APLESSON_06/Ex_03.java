import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		
		String ben = kb.nextLine();
		
		int marks = ben.length();
		
		for(int d = marks; d >= 1; d--)
		{
			System.out.println(ben.substring(0,d));
		}
	}
}