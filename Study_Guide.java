import java.util.Scanner;

public class Study_Guide
{
	public static void main(String[]args)
	{
		//Question_01
		int num = 45;
		System.out.println("IronMan has  "+num+"  kinds of weapons in his suit.");

		//Question_02
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres+ "  once said, \"" + quote+"\"");
		
		//Question_03
		int h = 45;
		int w = 64;
		int Area = ((45)*(64));
		System.out.println("The area of your rectangle is "+ Area);
		
		//Question_04
		Scanner kb = new Scanner(System.in);
		System.out.println("How many pieces of pizza do you want? ");
		int slices = kb.nextInt();
		System.out.println(slices + "  slices, coming right up!");

		//Produces an error because "seven" is a String, and variable "Slices" is an int.
		
		//Question_05
		System.out.println("What is your name? ");
		//kb.nextLine();
		String answer = kb.next();
		
		System.out.println("Is there a Mr. or Mrs. " + answer + "?");
		//Answer is C
		
		//Question_06
		//A
		
		//Question_07
		//Produces an error because the quotations around "I believe I can fly" end the String.
		//You can fix this by putting a backslash before the two quotation marks.
		
		//Question_08
		System.out.println("This one goes on top \n This one goes on bottom");
		
		//Question_09
		System.out.println("a \t b \t c \n d \t e \t f \n g \t h \t i");
		
		//Question_10
		System.out.println("Please enter your Math grade: ");
		double math = kb.nextDouble();
		System.out.println("Please enter your Science grade: ");
		double science = kb.nextDouble();
		System.out.println("Please enter your English grade: ");
		double english = kb.nextDouble();
		System.out.println("Please enter your History grade: ");
		double history = kb.nextDouble();
		System.out.println("Please enter your COMPSCI grade: ");
		double compsci = kb.nextDouble();
		System.out.println("Please enter your Basketball PE grade: ");
		double Basketball = kb.nextDouble();
		System.out.println("Please enter your CGI grade: ");
		double CGI = kb.nextDouble();

		double gpa = (math + science + english + history + compsci+ Basketball+ CGI)/7;
		System.out.println(gpa);

	}
	
}