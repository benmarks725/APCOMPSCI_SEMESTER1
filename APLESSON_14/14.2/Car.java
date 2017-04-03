public abstract class Car implements Location
{
	private int ID;
	public double[] location;
	public Car()
	{
		ID = (int)(Math.random()* 900000)+100000;
		location = new double[2];
	}
	public int getID()
	{
		return ID;
	}
	public void Move(double xcoordinate, double ycoordinate)
	{
		location[0] += xcoordinate;
		location[1] += ycoordinate;
	}
	public double[] getLoc()
	{
		return location;
	}
}