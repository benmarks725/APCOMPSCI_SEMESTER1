import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		String [][] word = new String[4][4];
		Scanner bm = new Scanner(System.in);
		for (int u = 0; u < word.length; u++)
		{
			for (int w = 0; w < word[u].length; w++)
			{
				System.out.println("Enter a word: ");
				word[u][w] = bm.nextLine();
			}
		}
		for (int u = 0; u < word.length; u++)
		{
			for (int w = 0; w < word[u].length; w++)
			{
				System.out.print(word[u][w] + "\t\t");
			}
			System.out.println("");
		}
	}
}