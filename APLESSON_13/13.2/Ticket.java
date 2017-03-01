import java.util.*;
public abstract class Ticket
{
	int serialNo;
	public Ticket()
	{
		serialNo = (int)(Math.random()*9999999+1);
	}
	public abstract int getPrice();
	public int getSerialNo()
	{
		return serialNo;
	}
	public String toString()
	{
		return "Ticket #: \t\t"+this.getSerialNo()+
					"\nPaid:\t\t $" + this.getPrice();
					
	}
}