import java.util.Scanner; //import Statement

public class BMICALCULATOR
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
        Scanner keyboard = new Scanner(System.in);

        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;

        System.out.print("Enter your weight in pounds: ");
        weight = keyboard.nextDouble();

        System.out.print("Enter your height: ");
        height = keyboard.nextDouble();

        bmi = ((weight * 703)/(height * height));

        System.out.println("Your BMI is" + bmi);

     }
}