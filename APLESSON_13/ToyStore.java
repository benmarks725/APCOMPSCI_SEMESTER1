import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ToyStore
{
	ArrayList<Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	public ToyStore(String b)
	{
		loadToys(b);
	}
	public void loadToys(String bs)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(bs.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1); 
			Toy b = getThatToy(name);
			if (b == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				else
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				b.setCount(b.getCount()+1);
			}

		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x:toyList)
		{
			if(x.getType().equals("Car"))
				cars++;
			if(x.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
		
	}
	public String toString()
	{
		return toyList.toString();
	}
}