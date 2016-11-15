import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String sente = bm.nextLine();
		replace(sente);
	}
	public static void replace(String sente)
	{
		while (sente.indexOf("a") >= 0)
		{
			sente = sente.substring(0, sente.indexOf("a")) + "@" + sente.substring(sente.indexOf("a") + 1);
		}
		System.out.println(sente);
	}
}