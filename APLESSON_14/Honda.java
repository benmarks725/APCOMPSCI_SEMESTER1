public class Honda implements Location
{
	private double xcoordinate, ycoordinate;
	public Honda()
	{
		xcoordinate = 0;
		ycoordinate = 0;		
	}
	public Honda(double[] coord)
	{
		xcoordinate = coord[0];
		ycoordinate = coord[1];
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