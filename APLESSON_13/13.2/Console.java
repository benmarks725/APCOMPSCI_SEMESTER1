public class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	public Console(String b)
	{
		super(b);
	}
	public String getPlatform()
	{
		return super.getPlatform();
	}
	/* public int getSerial(){
		return super.getSerial();
	} */
	public String getController()
	{
		return "unknown";
	}
	public String toString()
	{
		return "Platform: "+ this.getPlatform()+ 
					"\nSerial #: " +super.getSerial()+ 
					"\nController: "+this.getController()+
					"\n---------------------------------";
	}
}