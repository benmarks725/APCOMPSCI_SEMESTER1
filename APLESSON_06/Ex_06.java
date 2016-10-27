import java.util.Scanner;

public class Ex_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please input a word:");
		
		String boopWord = kb.nextLine();
		
		int loopString = boopWord.length();
		
		for (int i = 0; i <= loopString; i++)
		{
			System.out.println(boopWord.substring(i, loopString));
		}
	}
}