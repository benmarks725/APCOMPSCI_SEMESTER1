public class Toyota implements Location
{	
	private String scoor;
	private double Coorx;
	private double Coory;
	public Toyota()
	{
		scoor = "";		
	}
	public Toyota(String inp)
	{
		scoor = inp;
	}
	public double[] getLoc()
	{
		String str = scoor;
		String[] sep = scoor.split(", ");
		Coorx = Double.valueOf(sep[0]).doubleValue();
		Coory = Double.valueOf(sep[1]).doubleValue();
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