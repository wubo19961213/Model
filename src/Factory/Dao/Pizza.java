package Factory.Dao;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList toppings = new ArrayList<>();
	void prepare()
	{
		System.out.println("Preparing"+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i = 0;i<toppings.size();i++)
		{
			System.out.println(" "+toppings.get(i));
		}
	}
	void bake()
	{
		System.out.println("Back for 25 minutes at 350");
	}
	void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box()
	{
		System.out.println("Place pizza in official PizzaStore box");
	}
	public String getName()
	{
		return this.name;
	}
}
