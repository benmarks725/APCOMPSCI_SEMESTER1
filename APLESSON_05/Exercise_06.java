import java.util.Scanner;

public class Exercise_06
{
	static String baby = "benmarks";
	static String ohbaby = "robinette";
	
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
		
		if ((kbUsername.equals(baby)) && (kbPassword.equals(ohbaby)))
		{
			System.out.println("You are granted access!");
		}
		
		if (!(kbUsername.equals(baby)) && (kbPassword.equals(ohbaby)))
		{
			System.out.println("Your username is incorrect.");
			passwordVerify();
		}
		
		if ((kbUsername.equals(baby)) && !(kbPassword.equals(ohbaby)))
		{
			System.out.println("Your password is incorrect.");
			passwordVerify();
		}
		
		if (!(kbUsername.equals(baby)) && !(kbPassword.equals(ohbaby)))
		{
			System.out.println("Your username and password are incorrect");
			passwordVerify();
		}
	}
}