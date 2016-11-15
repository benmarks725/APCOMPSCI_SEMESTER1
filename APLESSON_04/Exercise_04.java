import java.util.Scanner;

public class Exercise_04
{
	static double radius = 0.0;
	static double area = 0.0;
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length of the radius: ");
        radius = kb.nextDouble();
		calcArea();
		print();
    }
	public static void calcArea()
	{
		area = 3.14159265*(radius*radius);
	}
	public static void print()
	{
		System.out.println("The area of the circle is " + area);
	}
}