package DecoratorPattern.Dao.imp;

import DecoratorPattern.Dao.Beverage;
import DecoratorPattern.Dao.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	public String getDescription()
	{
		return beverage.getDescription()+",Mocha";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20+beverage.cost();
	}
	
}
