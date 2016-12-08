import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner bm = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String expression = bm.nextLine();
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		System.out.println(expression);
		System.out.println(equation);
		doEquation(equation);
	}
	public static void doEquation(ArrayList<String> equation)
	{
		int b = 0;
		while (b < equation.size()){
			if  (equation.get(b).equals("*") || equation.get(b).equals("/"))
			{
				if(equation.get(b).equals("*"))
				{
					equation.set(b,""+(Integer.parseInt(equation.get(b-1))*Integer.parseInt(equation.get(b+1))));
				}
				else
				{
					equation.set(b,""+(Integer.parseInt(equation.get(b-1))/Integer.parseInt(equation.get(b+1))));
				}
				equation.remove(b-1);
				equation.remove(b);
			}
			else
			b++;
		}
		b = 0;
		while(b < equation.size())
		{
			if( equation.get(b).equals("+") || equation.get(b).equals("-"))
			{
				if(equation.get(b).equals("+"))
				{
					equation.set(b,"" + (Integer.parseInt(equation.get(b-1))  +  Integer.parseInt(equation.get(b+1))));
				}
				else{
					equation.set(b,"" + (Integer.parseInt(equation.get(b-1))  -  Integer.parseInt(equation.get(b+1))));
				}
				equation.remove(b-1);
				equation.remove(b);
			}
			else 
			b++;
		}
		System.out.println(equation);
	}
}