package ���󹤳�ģʽ.Order;

import ���󹤳�ģʽ.Pizza.BeiJingCheesePizza;
import ���󹤳�ģʽ.Pizza.BeiJingPepperPizza;
import ���󹤳�ģʽ.Pizza.Pizza;

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
