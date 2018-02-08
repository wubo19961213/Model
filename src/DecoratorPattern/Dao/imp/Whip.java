package DecoratorPattern.Dao.imp;

import DecoratorPattern.Dao.Beverage;
import DecoratorPattern.Dao.CondimentDecorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}
	public String getDescription()
	{
		return beverage.getDescription()+",Whip";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}
}