public abstract class Console extends GameSystem
{
	String Controller;
	public Console() 
	{
        super();
    }
    public Console(String b) 
	{
        super(b);
    }
    public abstract String getController();
    public String toString() 
	{
        return "Platform: " + getPlatform()
			+ "\nSerial #: " + super.getSerialNo()
			+ "\nController: " + getController();
    }
}