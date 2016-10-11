import java.util.Scanner;

public class Ex03
{
	public static void main(String[]args)
	{
        Scanner keyboard = new Scanner(System.in);

        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;
		String condition = "";

        System.out.print("Enter your weight in pounds: ");
        weight = keyboard.nextDouble();

        System.out.print("Enter your height: ");
        height = keyboard.nextDouble();

        bmi = ((weight * 703)/(height * height));

        
		if (bmi <=18.5)
			condition="underweight";
		else if (bmi <=24.9)
			condition="normal";
		else if (bmi <=29.9)
			condition="Overweight";
		else if (bmi <=34.9)
			condition="Obese";
		else if (bmi <=39.9)
			condition="Very Obese";
		else
			condition="Morbidly Obese";
		
		System.out.println("Your BMI is " + bmi + "\nYour condition is "+condition);

     }
}