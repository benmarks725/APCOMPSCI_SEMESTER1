import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		int [][] numbers = new int [4][4];
		Scanner bm = new Scanner(System.in);
		for (int u = 0; u < numbers.length; u++)
		{
			for (int w = 0; w < numbers[u].length; w++)
			{
				numbers[u][w] = 1 + (int)((Math.random()*101));
				System.out.print(numbers[u][w] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Enter a number: ");
		int Divisor = bm.nextInt();
		int Count = 0;
		for (int u = 0; u < numbers.length; u++)
		{
			for (int w = 0; w < numbers[u].length; w++)
			{
				if (numbers[u][w] % Divisor == 0)
				{
					Count += 1;
				}
			}
		}
		System.out.println("There are " + Count + " numbers divisible by " + Divisor + " in the Array.");
	}
}