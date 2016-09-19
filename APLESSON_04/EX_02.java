import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		EX_02 receipt = new EX_02();
		
		System.out.println("Enter your first name:");
		String item1 = input.nextLine();
		
		System.out.println("Enter your last name:");
		String item2 = input.nextLine();

		System.out.println("Enter your title:");
		String item3 = input.nextLine();
		
		System.out.println("Enter the school site:");
		String item4 = input.nextLine();
		
		System.out.println("Enter the school year:");
		String item5 = input.nextLine();

		System.out.println("What is your subject?");
		String item6 = input.nextLine();
		
		System.out.println("****************************************");
		receipt.printReceipt(item4, item5);
		receipt.printReceipt(item1, item2);
		receipt.printReceipt(item3, item6);
		System.out.println("****************************************");
	}
	
		public void printReceipt(String item1, String item2)
		{		
			System.out.printf("* %15s %20s *\n", item1, item2);
		}
}