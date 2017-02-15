public abstract class Toy
{
	private String name;
	private double count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setCount(double c)
	{
		this.count = c;
	}
	public String getName()
	{
		return name;
	}
	public double getCount()
	{
		return count;
	}
	public abstract String getType();
	public String toString()
	{
		return name + "\t...\t" + count;
	}
}