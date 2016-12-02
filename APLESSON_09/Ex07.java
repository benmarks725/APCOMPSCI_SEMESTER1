import java.util.Scanner;
public class Ex07
{
	static String Array = "";
	public static void main(String[]args)
	{
		String [] words = new String[5];
		fillArray(words);
		System.out.println("For the words... " + printArray(words));
		System.out.println("Only "+ hasZs(words) + " ...contain(s) the letter z.");
	}
	public static void fillArray(String[] word)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Enter five words: ");
		for (int b = 0; b < word.length; b++)
		{
			word[b] = bm.next();
		}
	}
	public static String printArray(String[] wor)
	{
		for (String m: wor)
		{
			Array += m + " ";
		}
		return Array;
	}
	public static String hasZs(String[] word1)
	{
		String z = "";
		for (String uw: word1)
		{
			if (uw.indexOf("z") >= 0)
			{
				z += uw + " ";
			}
			else
			{
				z += "";
			}
		}
		return z;
	}
}