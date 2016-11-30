import java.util.Scanner;
public class Ex03
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int b = 0; b < numbers.length; b++)
		{
			numbers[b] = (int)Math.floor(Math.random()*100)+1;
		}
		System.out.println("Numbers... ");
		for(int numb : numbers)
		{
			System.out.print(numb + " ");
		}
		System.out.println("\nThe Average of the above numbers is... " + Average(numbers));
	}
	public static double Average(int[]numbers)
	{
		int sum = 0;
		for(int numb : numbers)
		{
			sum += numb;
		}
		return (double)sum/numbers.length;
	}
}