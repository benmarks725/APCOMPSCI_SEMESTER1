import java.util.Scanner;
public class Ex_06
{
	static int HEALTHLOAD = 6, healthCount=6;
	static String[] health = new String[HEALTHLOAD];
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		int damage = 0;
		int amount = 0;
		String turn = "";
		while((turn.equals("Q") == false) && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = bm.nextLine();
			damage = (int)(Math.random()*2+1);
			amount = (int)(Math.random()*6+1);
			takeDamage(damage, amount);
			printClip();
		}
		System.out.println("You died!");
	}
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking "+amount+" damage!";
		}
		else if((healthCount + damage < HEALTHLOAD))
		{
			healthCount += amount;
		}
		else
		{
			healthCount = HEALTHLOAD;
		}
		return "Power Up"+amount;
	}
	public static void printClip()
	{
		String output = "Health\t";
		for(int b = 0; b < HEALTHLOAD; b++)
		{
			if (b < healthCount)
			{
				health[b]= "@";
			}
			else
			{
				health[b]= "[]";
			}
			output += health[b];
		}
		System.out.println(output);
	}
}