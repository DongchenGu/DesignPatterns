package ��������ģʽ;

import ��������ģʽ.Pizza;

public class BeijingOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza  pizza =null;
	    if(orderType.equals("cheese")) {
		pizza = new BeiJingCheesePizza();
	    }else if (orderType.equals("pepper")) {
			pizza = new BeiJingPepperPizza();
		}
		return pizza;
	}
	
}
