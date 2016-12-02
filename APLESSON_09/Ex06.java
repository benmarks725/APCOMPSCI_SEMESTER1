public class Ex06
{
	static String arr = "";
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers... " + printArray(numbers));
		System.out.println("The biggest number is... " + getBiggest(numbers));
	}
	public static void fillArray(int[] num)
	{
		for (int b = 0; b < num.length; b++)
		{
			num[b] = (int)((Math.random()*101));
		}
	}
	public static String printArray(int[] numb)
	{
		for (int m: numb)
		{
			arr += m + " ";
		} 
		return arr;
	}
	public static int getBiggest(int[] numbe)
	{
		int big = 0;
		for (int uw: numbe)
		{
			if (uw > big)
			{
				big = uw;
			}
			else
			{
				big = big;
			}
		}
		return big;
	}
}