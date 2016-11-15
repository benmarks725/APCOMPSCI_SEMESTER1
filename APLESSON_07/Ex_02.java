import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = bm.nextInt();
		System.out.println("The average of the digits in "+num+" is "+avDigits(num));
	}
	public static double avDigits(int num)
	{
		int digits = 0;
		int average = 0;
		while(num > 0)
		{
			digits+=1;
			average+= num%10;
			num/= 10;
		}
		return (double)average/digits;
	}
}