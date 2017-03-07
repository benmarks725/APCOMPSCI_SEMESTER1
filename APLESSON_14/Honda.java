public class Honda implements Location
{
	private double Coorx, Coory;
	public Honda()
	{
		Coorx = 0;
		Coory = 0;		
	}
	public Honda(double[] inpcoor)
	{
		Coorx = inpcoor[0];
		Coory = inpcoor[1];
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