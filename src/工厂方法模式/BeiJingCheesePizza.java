package 工厂方法模式;

import 工厂方法模式.Pizza;

public class BeiJingCheesePizza extends Pizza{
 
	@Override
	public void prepare() {
		setName("北京奶酪披萨");
		// TODO Auto-generated method stub
		System.out.println("北京奶酪披萨原料准备");
	}
	
}
