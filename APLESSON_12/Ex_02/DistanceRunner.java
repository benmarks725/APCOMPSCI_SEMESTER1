import java.util.Scanner;
public class DistanceRunner
 {
 	public static void main(String[]args)
 	{
 		Scanner bm = new Scanner(System.in);
 		System.out.println("X-Coordinate of first point: ");
 		int xin1 = bm.nextInt();
 		System.out.println("Y-Coordinate of first point: ");
 		int yin1 = bm.nextInt();
		System.out.println("X-Coordinate of second point: ");
 		int xin2 = bm.nextInt();
		System.out.println("Y-Coordinate of second point: ");
 		int yin2 = bm.nextInt();
 		Distance object = new Distance(xin1, yin1, xin2, yin2);
 		System.out.println("Distance between (" + object.getX1() + ", " + object.getY1() + ")and (" + object.getX2() + ", " + object.getY2() +") is " + object.getDistance());
 		object.setValues(0,0,1,1);
 		System.out.println("Distance between (" + object.getX1() + ", " + object.getY1() + ")and (" + object.getX2() + ", " + object.getY2() +") is " + object.getDistance());
 	}
 } 