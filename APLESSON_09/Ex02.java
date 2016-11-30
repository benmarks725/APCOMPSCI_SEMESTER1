import java.util.Scanner;
public class Ex02
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Enter five words: ");
		for (int b = 0; b < words.length; b++)
		{
			words[b] = bm.next();
		}
		System.out.println("\nThe First Letters are:");
		First(words);
	}
	public static String First(String[] word1)
	{
		for (String word : word1)
			{
				System.out.println(word.charAt(0));
			}
			return "";
	}
}