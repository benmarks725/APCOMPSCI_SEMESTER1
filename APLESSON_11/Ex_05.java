import java.util.Scanner;
public class Ex_05
{
	static int bulletCount = 96;
	static int CLIPSIZE = 16;
	static int shotCount = 16;
	static String [] clip = new String [16];
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Reload!");
		resetClip();
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = bm.nextLine().toUpperCase();
			if (action.equals("R"))
			{
				reload();
			}
			if (action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
	}
	public static void resetClip()
	{
		for (int b = 0; b < clip.length; b++)
		{
			clip[b] = "[]";
		}
	}
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("\nBoom!!!");
		}
		else
		{
			System.out.println("\nReload!!!");
		}
		return "";
	}
	public static void reload()
	{
		if (bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for (int b = 0; b < shotCount; b++)
		{
			clip[b] = " * ";
		}
	}
	public static void printClip()
	{
		String Output = "";
		Output = "Bullets: \t" + bulletCount + "\nClip:\t";
		for (int b = 0; b < CLIPSIZE; b++)
		{
			Output += clip[b];
		}
		System.out.println(Output);
	}
}