import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = bm.nextInt();
		System.out.println("The sum of the digits in "+num+" is "+sumDigits(num));
	}
	public static int sumDigits(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}