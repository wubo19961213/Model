package DecoratorPattern.Dao;

import DecoratorPattern.Dao.Beverage;

public abstract class CondimentDecorator extends Beverage{

	@Override
	public abstract String getDescription();
}
