import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("hair:");
		String inhair = bm.nextLine();
		System.out.println("eyes:");
		String ineyes = bm.nextLine();
		System.out.println("skin:");
		String inskin = bm.nextLine();
		Human object = new Human("black", "brown", "tan");
		System.out.println("My info:");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
		object.setAttributes(inhair, ineyes, inskin);
		System.out.println("\nFriend's info:");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
	}
}