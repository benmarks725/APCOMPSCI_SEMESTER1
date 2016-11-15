import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = bm.nextInt();
		System.out.println(num+" reversed is "+getReverse(num));
	}
	public static int getReverse(int num)
	{
		int rev = 0;
		while(num > 0)
		{
			rev*= 10;
			rev+=num%10;
			num/=10;
		}
		return rev;
	}
}