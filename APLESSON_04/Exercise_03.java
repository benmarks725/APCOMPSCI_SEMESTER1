import java.util.Scanner;

public class Exercise_03
{
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);

        double side = 0.0;
        double surfacearea = 0.0;

        System.out.print("Enter the length of the side: ");
        side = kb.nextDouble();

        surfacearea = 6*(side*side);

        System.out.println("The surface area of the cube is " + surfacearea);

     }
}