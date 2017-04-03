public class Toyota extends Car
{
	public Toyota(String position)
	{
		location = new double[2];
		String positionSplit[] = position.split(", ");
		location[0] = Double.parseDouble(positionSplit[0]);
		location[1] = Double.parseDouble(positionSplit[1]);
	}
}