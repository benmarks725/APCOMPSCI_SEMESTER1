public class GMC implements Location
{
	private int xcoordinate, ycoordinate;
	public GMC()
	{
		xcoordinate = 0;
		ycoordinate = 0;		
	}
	public GMC(int x, int y)
	{
		xcoordinate = x;
		ycoordinate = y;
	}
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = xcoordinate;
		location[1] = ycoordinate;
		return location;
	}
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
}