import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double MilesPerH;
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		MilesPerH = 0;
	}
	public MilesPerHour(int dist, int hour, int minut)
	{
		distance = dist;
		hours = hour;
		minutes = minut;
		MilesPerH = 0;
	}
	public void setValues(int dist, int hour, int minut)
	{
		distance = dist;
		hours = hour;
		minutes = minut;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public double getMPH()
	{
		return (distance/(hours + (minutes / 60.0)));
	}
} 