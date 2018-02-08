package DecoratorPattern.Dao.imp;

import DecoratorPattern.Dao.Beverage;
import DecoratorPattern.Dao.CondimentDecorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}
	public String getDescription()
	{
		return beverage.getDescription()+",Soy";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15+beverage.cost();
	}
	
}