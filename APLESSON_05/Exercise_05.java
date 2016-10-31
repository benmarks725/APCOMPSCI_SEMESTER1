import java.util.Scanner;

public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		String run1 = "";
		String inside1 = "";
		String robber1 = "";
		String clown1 = "";

		System.out.println("Welcome to my adventure game \n");
		System.out.println(" You are in a random park. Would you like to run 'inside' or 'stay outside'? ");
		run1 = bm.nextLine();

		if (run1.equalsIgnoreCase("stay outside")) 
		{
			System.out.println("There is a man with a clown mask on. Off to one side there is, as you'd not expect, a gun. You may pick up the 'gun' or flee the 'area'. ");
		
			inside1 = bm.next();
			
			if (inside1.equalsIgnoreCase("gun")) 
			{
				System.out.println("The clown is approaching very slowly. It looks pretty nasty. Would you like to defend yourself, 'Yes' or 'No'?");
     
				clown1 = bm.next();
				
				if (clown1.equalsIgnoreCase("Yes")) 
				{
					System.out.println("  ");
					System.out.println("You live!");
				}
				else if (clown1.equalsIgnoreCase("No")) 
				{
					System.out.println("  ");
					System.out.println("The clown will take you away!");
				}
			}
			else if (inside1.equalsIgnoreCase("area")) 
			{
				System.out.println("Congratulations you survived!");
        
				clown1 = bm.next();
			}
		}
		else if (run1.equalsIgnoreCase("inside")) 
		{
			System.out.println("There is a robber inside. Do you want to 'fight' them, or 'run away'?");
        
			robber1 = bm.nextLine();
			
			if (robber1.equalsIgnoreCase("fight")) 
			{
				System.out.println("  ");
				System.out.println("You're weak and you will die");
			}	
			else if (robber1.equalsIgnoreCase("run away")) 
			{
				System.out.println("  ");
				System.out.println("You died because your too slow & can't run");
			}
		}
	}
}
