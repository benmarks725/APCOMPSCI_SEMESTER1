public abstract class GameSystem
{
	public String platform;
	public int serialNo;
	public GameSystem()
	{
		platform = "";
	}
	public GameSystem(String b)
	{
		platform = b;
		serialNo = (int)(Math.random() * 1000000);
	}
	public abstract String getPlatform();
	public int getSerialNo()
	{
		return serialNo;
	}
}