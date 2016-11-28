import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner bm=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = bm.nextLine();
		Tree(input,0,input.length());
	}
	public static String Tree(String word,int start,int stop)
	{
		if (start<=stop)
		{
			System.out.printf("%20s%n",word.substring(0,start));
			return Tree(word,start+1,stop);
		}
		return " ";
	}
}