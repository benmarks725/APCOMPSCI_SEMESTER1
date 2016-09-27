import java.util.Scanner;

public class SURFACE_AREA_CYLINDER
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double radius = 0.0;
        double height = 0.0;
        double SurfaceArea = 0.0;

        System.out.print("Enter the radius: ");
        radius = keyboard.nextDouble();

        System.out.print("Enter the height: ");
        height = keyboard.nextDouble();

        SurfaceArea = (((2)*(3.14159)*(radius)*(height))+ ((2)*(3.14159)*(radius)*(radius)));

        System.out.println("The surface area of the cylinder is " + SurfaceArea);
		
	}
}