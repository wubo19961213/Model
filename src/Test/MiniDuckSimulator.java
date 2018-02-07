package Test;

import Dao.Duck;
import Dao.FlyRocketPowered;
import Dao.MallardDuck;
import Dao.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();*/
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
