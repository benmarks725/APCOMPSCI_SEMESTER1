import java.util.Scanner;

public class Exercise_04
{
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);

        double radius = 0.0;
        double area = 0.0;

        System.out.print("Enter the length of the radius: ");
        radius = kb.nextDouble();

        area = 3.14159265*(radius*radius);

        System.out.println("The area of the circle is " + area);

     }
}