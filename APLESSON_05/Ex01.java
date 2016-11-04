import java.util.Scanner;

public class Ex01
{
	static double GPA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the 1st grade: ");
		String G1 = kb.nextLine();
		System.out.println("Enter the 2nd grade: ");
		String G2 = kb.nextLine();
		System.out.println("Enter the 3rd grade: ");
		String G3 = kb.nextLine();
		System.out.println("Enter the 4th grade: ");
		String G4 = kb.nextLine();
		System.out.println("Enter the 5th grade: ");
		String G5 = kb.nextLine();
		System.out.println("Enter the 6th grade: ");
		String G6 = kb.nextLine();
		System.out.println("Enter the 7th grade: ");
		String G7 = kb.nextLine();
		
		double GPA1 = calculatePoints(G1);
		double GPA2 = calculatePoints(G2);
		double GPA3 = calculatePoints(G3);
		double GPA4 = calculatePoints(G4);
		double GPA5 = calculatePoints(G5);
		double GPA6 = calculatePoints(G6);
		double GPA7 = calculatePoints(G7);
		
		double GPAtotal = (GPA1 + GPA2 + GPA3 + GPA4 + GPA5 + GPA6 + GPA7)/7;
		System.out.printf("Your GPA is %4.2f", GPAtotal);
	}
	
	public static double calculatePoints(String grade)
	{
		if (grade.equals("A"))
		{
			return GPA = 4.0;
		}
		if (grade.equals("B"))
		{
			return GPA = 3.0;
		}
		if (grade.equals("C"))
		{
			return GPA = 2.0;
		}
		if (grade.equals("D"))
		{
			return GPA = 1.0;
		}
		if (grade.equals("F"))
		{
			return GPA = 0.0;
		}
		if (grade.equals("a"))
		{
			return GPA = 4.0;
		}
		if (grade.equals("b"))
		{
			return GPA = 3.0;
		}
		if (grade.equals("c"))
		{
			return GPA = 2.0;
		}
		if (grade.equals("d"))
		{
			return GPA = 1.0;
		}
		if (grade.equals("f"))
		{
			return GPA = 0.0;
		}
		return GPA;
	}
}