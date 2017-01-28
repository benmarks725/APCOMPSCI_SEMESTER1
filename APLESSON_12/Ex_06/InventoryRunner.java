import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Item Name:");
		String in = bm.nextLine();
		System.out.println("Manufacturer:");
		String m = bm.nextLine();
		System.out.println("Will you be entering item category and price? (y/n)");
		String response = bm.nextLine();
		if (response.equals("y"))
		{
			System.out.println("Category:");
			String c = bm.nextLine();
			System.out.println("Item price:");
			int p = bm.nextInt();
			Inventory yre = new Inventory(m, in, c, p);
			System.out.println(yre);
		}
		if (response.equals("n"))
		{
			Inventory nre = new Inventory(m, in);
			System.out.println(nre);
		}
	}
}