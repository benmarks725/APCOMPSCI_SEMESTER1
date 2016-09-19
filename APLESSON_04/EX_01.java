import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		EX_01 receipt = new EX_01();
		
		System.out.println("Please enter item 1:");
		String item1 = input.nextLine();
		System.out.println("Please enter the price:");
		double price1 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = input.nextLine();
		System.out.println("Please enter the price:");
		double price2 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = input.nextLine();
		System.out.println("Please enter the price:");
		double price3 = input.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.printReceipt(item1, price1);
		receipt.printReceipt(item2, price2);
		receipt.printReceipt(item3, price3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal:", price1+price2+price3);
		receipt.printReceipt("Subtotal:", (price1+price2+price3)*(0.09));
		receipt.printReceipt("Subtotal:", (price1+price2+price3)*(1.09));
		System.out.println("\n________________________________________");
		System.out.println("* Thank you for your support *");
	}
	
		public void printReceipt(String item, double price)
		{		
			System.out.printf("\n* %15s ........\t %5.2f", item, price);
		}
}