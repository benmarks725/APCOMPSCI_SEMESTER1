import java.util.ArrayList;
import java.util.Arrays;
public class Ex_01
{	
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
		int numsSize = nums.size();
		System.out.println(removePrimes(nums));
	}
	public static int gFactor(int w)
	{
		for (int b = 2; b < w; b++)
		{
			if ((w % b) == 0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> numb)
	{
		for (int b = 0; b < numb.size(); b++)
		{
			if (gFactor(numb.get(b)) == 0)
			{
				numb.remove(b);
				b = b - 1;
			}
		}
		return numb;
	}
}