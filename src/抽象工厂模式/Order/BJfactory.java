package 抽象工厂模式.Order;

import 抽象工厂模式.Pizza.BeiJingCheesePizza;
import 抽象工厂模式.Pizza.BeiJingPepperPizza;
import 抽象工厂模式.Pizza.Pizza;

public class BJfactory  implements ABSfactory {
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza =null;
		if(orderType.equals("cheese")) {
			pizza = new BeiJingCheesePizza();
		}else if(orderType.equals("pepper")){
			pizza = new BeiJingPepperPizza();
		}
		return pizza;
	}
}
