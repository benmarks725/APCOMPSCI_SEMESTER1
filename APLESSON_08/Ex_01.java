import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		System.out.println(replace(bm.nextLine()));
	}
	public static String replace(String sente)
	{
		int ind = sente.indexOf(" ");
		if(ind == -1)
			return sente;
		return replace(sente.substring(0,ind) + "_" + sente.substring(ind+1));
	}
}