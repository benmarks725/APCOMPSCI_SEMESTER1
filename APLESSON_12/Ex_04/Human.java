public class Human
{
	private String hair, eyes, skin;
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public Human(String ha, String ey, String sk)
	{
		hair = ha;
		eyes = ey;
		skin = sk;
	}
	public void setAttributes(String ha, String ey, String sk)
	{
		hair = ha;
		eyes = ey;
		skin = sk;
	}
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
}