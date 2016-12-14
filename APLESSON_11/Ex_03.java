public class Ex_03
{
	public static void main(String[]args)
	{
		String [][] xAndO = new String [4][4];
		for (int u = 0; u < xAndO.length; u ++)
		{
			for (int w = 0; w < xAndO[u].length; w++)
			{
				int Pick = 1 + (int)((Math.random()*2));
				if (Pick == 1)
				{
					xAndO[u][w] = "x";
				}
				if (Pick == 2)
				{
					xAndO[u][w] = "o";
				}
				System.out.print(xAndO[u][w] + "\t");
			}
			System.out.println("");
		}
	}
}