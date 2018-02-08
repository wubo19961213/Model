package DecoratorPattern.Test;

import DecoratorPattern.Dao.Beverage;
import DecoratorPattern.Dao.imp.Espresso;
import DecoratorPattern.Dao.imp.HouseBlend;
import DecoratorPattern.Dao.imp.Mocha;
import DecoratorPattern.Dao.imp.Soy;
import DecoratorPattern.Dao.imp.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
	}
}
