package ���󹤳�ģʽ.Order;

import ���󹤳�ģʽ.Pizza.BeiJingCheesePizza;
import ���󹤳�ģʽ.Pizza.BeiJingPepperPizza;
import ���󹤳�ģʽ.Pizza.LondonCheesePizza;
import ���󹤳�ģʽ.Pizza.LondonPepperPizza;
import ���󹤳�ģʽ.Pizza.Pizza;

public class LDfactory implements ABSfactory {
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza =null;
		if(orderType.equals("cheese")) {
			pizza = new LondonCheesePizza();
		}else if(orderType.equals("pepper")){
			pizza = new LondonPepperPizza();
		}
		return pizza;
	}
}
