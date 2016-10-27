import java.util.Scanner;

public class Ex_07
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please input a word:");
		
		String word = kb.nextLine();
		
		int Word = word.length();
		
		for (int i = Word; i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}