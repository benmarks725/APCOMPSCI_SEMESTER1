import java.util.Scanner;

public class Exercise_03
{
	static double side = 0.0;
    static double surfacearea = 0.0;
	public static void main(String[]args)
	{
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        side = kb.nextDouble();
		calcSurf();
		print();
     }
	 public static void calcSurf()
	 {
		surfacearea = 6*(side*side);
	 }
	 public static void print()
	 {
		System.out.println("The surface area of the cube is " + surfacearea);
	 }
}