package Factory;

import java.awt.event.ItemEvent;

import Factory.Dao.Pizza;
import Factory.Dao.PizzaStore;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}
		return null;
	}

}
