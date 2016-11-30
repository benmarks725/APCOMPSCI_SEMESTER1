import java.util.Scanner;
public class Ex04
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Enter your starting number: ");
		int Start = bm.nextInt();
		System.out.println("Enter your sequence Size: ");
		int Size = bm.nextInt();
		int [] sequence = new int[Size];
		for (int b = 0; b < sequence.length; b++)
		{
			if (b == 0 || b == 1)
			{
				sequence[b] = Start;
			}
			else
			{
				sequence[b] = sequence[b-1] + sequence [b-2];
			}
			System.out.print(sequence[b] + " ");
		}
	}
}