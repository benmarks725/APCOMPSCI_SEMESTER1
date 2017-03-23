public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public StudentAdvance(int b)
	{
		super(b);
	}
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString()+"\n STUDENT ID REQUIRED";
	}
}