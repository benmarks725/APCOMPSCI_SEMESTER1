import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("paint:");
		String ipaint = bm.nextLine();
		System.out.println("interior:");
		String iinterior = bm.nextLine();
		System.out.println("engine:");
		String iengine = bm.nextLine();
		System.out.println("tires:");
		String itires = bm.nextLine();
		Car object = new Car(ipaint, iinterior, iengine, itires);
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint:\t\t" + object.getPaint());
		System.out.println("Interior:\t\t" + object.getInterior());
		System.out.println("Engine:\t\t" + object.getEngine());
		System.out.println("Tires:\t\t" + object.getTires());
	}
}