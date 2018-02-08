package Factory.Test;

import Factory.NYPizzaStore;
import Factory.Dao.Pizza;
import Factory.Dao.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
	}

}
