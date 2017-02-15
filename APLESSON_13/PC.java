public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String b)
	{
		super(b);
	}
	public String getSystemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + super.getPlatform()
				+ "\nSerial #: " + super.getSerialNo()
				+ "\nSystem Input: " + getSystemInput();
	}
}