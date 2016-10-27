import java.util.Scanner;

public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		String SD = "";
		String NY = "";
		String MI = "";
		String CA = "";

		System.out.println("Welcome to my adventure game \n");
		System.out.println(" You are in a random park. Would you like to SD 'inside' or 'stay outside'? ");
		SD = input.next();

		if (SD.equalsIgnoreCase("stay outside")) 
		{
		System.out.println("There is a man with a clown mask on. Off to one side there is, as you'd not expect, a gun. You may pick up the 'gun' or flee the 'area'. ");
		
		NY = input.next();
		}
		
		if (NY.equalsIgnoreCase("gun")) 
		{
        System.out.println("The clown is approaching very slowly. It looks pretty nasty. Would you like to defend yourself, 'Yes' or 'No'?");
        
        CA = input.next();
		}
		
        if (CA.equalsIgnoreCase("Yes")) 
		{
            System.out.println("  ");
            System.out.println("You live!");
		}
		
		else if (CA.equalsIgnoreCase("No")) 
		{
            System.out.println("  ");
            System.out.println("The clown will take you away!");
        }
		
		else if (NY.equalsIgnoreCase("inside")) 
		{
        System.out.println("There is a robber inside. Do you want to 'fight' them, or 'run away'?");
        
        MI = input.next();
		}
		
        if (MI.equalsIgnoreCase("fight")) 
		{
            System.out.println("  ");
            System.out.println("You're weak and die");
        }
		
		else if (MI.equalsIgnoreCase("run away")) 
		{
            System.out.println("  ");
            System.out.println("You died because your too slow & can't run");
		}
}
}