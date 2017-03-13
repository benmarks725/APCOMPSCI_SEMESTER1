public class Toyota implements Location
{	
	private String scoordinate;
	private double xcoordinate;
	private double ycoordinate;
	public Toyota()
	{
		scoordinate = "";		
	}
	public Toyota(String inp)
	{
		scoordinate = inp;
	}
	public double[] getLoc()
	{
		String str = scoordinate;
		String[] sep = scoordinate.split(", ");
		xcoordinate = Double.valueOf(sep[0]).doubleValue();
		ycoordinate = Double.valueOf(sep[1]).doubleValue();
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