import java.lang.Math;
public abstract class GameSystem
{
	String platform;
	int serialNo;
	public GameSystem()
	{
		this.platform = " ";
		this.serialNo = (int)(Math.random()*10000000 + 1);
	}
	public GameSystem(String b)
	{
		this.platform = b;
		this.serialNo = (int)(Math.random()*10000000 + 1);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
}