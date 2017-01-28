import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("First Name:");
		String ffn = bm.nextLine();
		System.out.println("Last Name:");
		String lln = bm.nextLine();
		System.out.println("Avatar? (y/n)");
		String aa = bm.nextLine();
		if (aa.equals("y"))
		{
			System.out.println("Avatar:");
			String aaa = bm.nextLine();
			UserClass avu = new UserClass(ffn, lln, aa);
			avu.setAvatar(aaa);
			System.out.println(avu);
		}
		if (aa.equals("n"))
		{
			UserClass nou = new UserClass(ffn, lln);
			System.out.println(nou);
		}
	}
}