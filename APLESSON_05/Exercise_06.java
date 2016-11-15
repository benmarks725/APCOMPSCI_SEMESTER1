import java.util.Scanner;

public class Exercise_06
{
	static String user = "benmarks";
	static String pass = "robinette";
	
	public static void main(String[]args)
	{
		passwordVerify();
	}
	public static void passwordVerify()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the username:");
		String kbUsername = kb.nextLine();
		System.out.println("Enter the password:");
		String kbPassword = kb.nextLine();
		
		if ((kbUsername.equals(user)) && (kbPassword.equals(pass)))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if (kbPassword.equals(pass))
			{
				System.out.println("Your username is incorrect.");
				passwordVerify();
			}
			else if (kbUsername.equals(user))
			{
				System.out.println("Your password is incorrect.");
				passwordVerify();
			}
			else
			{
				System.out.println("Your username and password are incorrect");
				passwordVerify();
			}
		}
	}
}
