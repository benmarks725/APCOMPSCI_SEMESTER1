import java.util.Scanner;

public class Ex_08
{
	static String bm;
	
	public static void main(String[]args)
	{
		System.out.println(sing("Na ", 4));
		
		System.out.println(sing("Na ", 4));
		
		System.out.println("Hey Hey Hey");
		
		System.out.println("Goodbye!");
	}
	public static String sing(String lyric, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.print(lyric);
		}
		return " ";
	}
}