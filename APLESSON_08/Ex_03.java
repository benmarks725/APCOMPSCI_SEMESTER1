import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Enter a number:");
		System.out.println(luck(bm.nextInt()));
	}
	public static int luck(int number)
	{
		if (number>0)
		{
		if (number%10==7)
		{return 1+(luck(number/10));}
		else
		{return 0+(luck(number/10));}
		}
		else
		{return 0;}
	}
}