import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a word:");
		String wordA = bm.nextLine();
		System.out.println("Input a word:");
		String wordB = bm.nextLine();
		System.out.println("Input a word:");
		String wordC = bm.nextLine();
		System.out.println(makeCenter(wordA));
		System.out.println(makeCenter(wordB));
		System.out.println(makeCenter(wordC));
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;		
		return makeCenter(" " + word + " ");
	}
}