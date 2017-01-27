import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Distance in miles:");
		int distance = bm.nextInt();
		System.out.println("Hours:");
		int hours = bm.nextInt();
		System.out.println("Minutes:");
		int minutes = bm.nextInt();
		MilesPerHour obj = new MilesPerHour(10, 2, 0);
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
		obj.setValues(distance, hours, minutes);
		System.out.println("\nUser Input:");
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
	}
}