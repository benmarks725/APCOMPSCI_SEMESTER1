import java.util.Scanner;

public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		String Go = "";
		String Look = "";
		String Pantry = "";
		String Eat = "";

		System.out.println("Welcome to my adventure game \n");
		System.out.println(" You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'? ");
		Go = input.next();

		if (Go.equalsIgnoreCase("kitchen")) 
		{
		System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");
		
		Look = input.next();
		}
		
		if (Look.equalsIgnoreCase("refrigerator")) 
		{
        System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");
        
        Eat = input.next();
		}
		
        if (Eat.equalsIgnoreCase("Yes")) 
		{
            System.out.println("  ");
            System.out.println("You live!");
		}
		
		else if (Eat.equalsIgnoreCase("No")) 
		{
            System.out.println("  ");
            System.out.println("You die of starvation!");
        }
		
		else if (Look.equalsIgnoreCase("pantry")) 
		{
        System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");
        
        Pantry = input.next();
		}
		
        if (Pantry.equalsIgnoreCase("fight")) 
		{
            System.out.println("  ");
            System.out.println("You're weak and die");
        }
		
		else if (Pantry.equalsIgnoreCase("run away")) 
		{
            System.out.println("  ");
            System.out.println("You died because your too slow & can't run");
		}
}
}