public class GMC implements Location
{
	private int Coorx, Coory;
	public GMC()
	{
		Coorx = 0;
		Coory = 0;		
	}
	public GMC(int x, int y)
	{
		Coorx = x;
		Coory = y;
	}
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = Coorx;
		location[1] = Coory;
		return location;
	}
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
}