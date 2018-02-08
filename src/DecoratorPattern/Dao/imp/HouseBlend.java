package DecoratorPattern.Dao.imp;

import DecoratorPattern.Dao.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "House Blend Coffee";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
}
