import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");

		String name = keyboard.nextLine();
		
		System.out.println("Wow! " + name + " why would anyone name a baby that!");

		//prompt for user input
		System.out.println("How old are you? ");

		String age = keyboard.nextLine();
		
		System.out.println("Wow! " + age + " is a terrible age.");
		
		//prompt for user input
		System.out.println("What do you do for fun? ");

		String activity = keyboard.nextLine();
		
		System.out.println("Wow! " + activity + " no one does that!");
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");

		String music = keyboard.nextLine();
		
		System.out.println("Wow! " + music + " no one likes that!");
		
		//prompt for user input
		System.out.println("How many siblings do you have? ");

		String brother = keyboard.nextLine();
		
		System.out.println("Wow! " + brother + " that must be bad.");
		
		//prompt for user input
		System.out.println("What do you want to do when you grow up? ");

		String job = keyboard.nextLine();
		
		System.out.println("Wow! " + job + " you will be a failure.");
	}
}