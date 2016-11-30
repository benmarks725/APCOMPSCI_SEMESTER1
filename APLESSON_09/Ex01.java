import java.util.Scanner;
public class Ex01
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		String[] word5 = new String[5];
		System.out.println("Enter 5 words: ");
		for(int b = 0; b < word5.length; b++)
		{
			word5[b] = bm.next();
		}
		System.out.println("In order...");
		for(String word : word5)
		{
			System.out.println(word);
		}
		System.out.println("\nReversed...");
		reverse(word5);
	}
	public static void reverse(String[]word5)
	{
		for(int b = word5.length; b > 0; b--)
		{
			System.out.println(word5[b-1]);
		}
	}
}