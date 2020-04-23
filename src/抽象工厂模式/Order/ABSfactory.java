package 抽象工厂模式.Order;

import 抽象工厂模式.Pizza.Pizza;

//这是一个抽象工厂模式的抽象层 (接口)
public interface ABSfactory {
     //让下面的工厂子类来具体实现
	public Pizza createPizza(String orderType);
	
}
