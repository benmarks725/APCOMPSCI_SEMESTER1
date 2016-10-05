import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Exercise_02 receipt = new Exercise_02();
		
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
		
		double subTotal = price1+price2+price3;
		double discounted = subTotal - (discount(subTotal));
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.printReceipt(item1, price1);
		receipt.printReceipt(item2, price2);
		receipt.printReceipt(item3, price3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal:", subTotal);
		receipt.printReceipt("Discount: ", discount(subTotal));
		receipt.printReceipt("Tax: ", discounted * 0.08);
		receipt.printReceipt("Total:", discounted * 1.08);
		System.out.println("\n________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
		public void printReceipt(String item, double price)
		{		
			System.out.printf("\n* %15s ........\t %5.2f", item, price);
		}
		public static double discount(double total)
		{
			double dis = 0;
			if (total >= 2000)
				dis = total*0.15;
			if (total < 2000)
				dis = 0;
			return dis;
			
		}
}