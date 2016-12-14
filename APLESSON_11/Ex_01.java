public class Ex_01
{
	public static void main(String[]args)
	{
		int [][] numbers = new int [4][4];
		for (int u = 0; u < numbers.length; u++)
		{
			for (int w = 0; w < numbers[u].length; w++)
			{
				numbers[u][w] = (int)((Math.random()*20));
			}
		}
		for (int u = 0; u < numbers.length; u++)
		{
			for (int w = 0; w < numbers[u].length; w++)
			{
				System.out.print(numbers[u][w] + "\t");
			}
			System.out.println("");
		}
	}
}