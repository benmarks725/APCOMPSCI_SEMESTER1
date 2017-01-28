import java.lang.Math;
public class UserClass
{
	private String firstName, lastName, avatar;
	private int UserID;
	public UserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		UserID = 0;
	}
	public UserClass(String fname, String lname)
	{
		firstName = fname;
		lastName = lname;
		avatar = "undefined";
		UserID = (int)(Math.random() * 1000000) + 1; 
	}
	public UserClass(String fname, String lname, String avat)
	{
		firstName = fname;
		lastName = lname;
		avatar = avat;
		UserID = (int)(Math.random() * 1000000) + 1;
	}
	public void setAvatar(String a)
	{
		avatar = a;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
        "\nLast Name: " + lastName +
        "\nAvatar : " + avatar +
		"\nUser ID# : " + UserID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getAvatar()
	{
		return avatar;
	}
	public int getID()
	{
		return UserID;
	}
}