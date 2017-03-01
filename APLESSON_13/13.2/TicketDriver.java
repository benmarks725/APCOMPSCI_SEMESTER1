public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket wkp = new Walkup();
		Ticket adv = new Advance(11);
		Ticket adv2 = new Advance(9);
		Ticket sad = new StudentAdvance(11);
		Ticket sad2 = new StudentAdvance(9);
		System.out.println(wkp);
		System.out.println(adv);
		System.out.println(adv2);
		System.out.println(sad);
		System.out.println(sad2);
	}
}