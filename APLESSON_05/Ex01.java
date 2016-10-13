import java.util.Scanner;

public class Ex01
{
	static double gpa;
	
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
		
		double gpa1 = calcPoints(G1);
		double gpa2 = calcPoints(G2);
		double gpa3 = calcPoints(G3);
		double gpa4 = calcPoints(G4);
		double gpa5 = calcPoints(G5);
		double gpa6 = calcPoints(G6);
		double gpa7 = calcPoints(G7);
		
		double GPAtotal = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6 + gpa7)/7;
		System.out.printf("Your GPA is %4.2f", GPAtotal);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return gpa = 4.0;
		}
		if (grade.equals("B"))
		{
			return gpa = 3.0;
		}
		if (grade.equals("C"))
		{
			return gpa = 2.0;
		}
		if (grade.equals("D"))
		{
			return gpa = 1.0;
		}
		if (grade.equals("F"))
		{
			return gpa = 0.0;
		}
		if (grade.equals("a"))
		{
			return gpa = 4.0;
		}
		if (grade.equals("b"))
		{
			return gpa = 3.0;
		}
		if (grade.equals("c"))
		{
			return gpa = 2.0;
		}
		if (grade.equals("d"))
		{
			return gpa = 1.0;
		}
		if (grade.equals("f"))
		{
			return gpa = 0.0;
		}
		return gpa;
	}
}