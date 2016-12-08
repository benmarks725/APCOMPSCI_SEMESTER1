import java.util.Scanner;
public class Ex05
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.print("\nThere are " + getOdds() + " odd numbers.");
	}
	public static void fillArray()
	{
		for (int b = 0; b< numbers.length; b++)
			numbers[b] = (int)(Math.random()*10)+1;
	}
	public static void printArray()
	{		
		for(int numb : numbers)
			System.out.print(numb + " ");
	}
	public static int getOdds()
	{
		int odds = 0;
		for (int numb : numbers)
		{
			if((numb % 2) == 1)
				odds ++;
		}
		return odds;
	}
}