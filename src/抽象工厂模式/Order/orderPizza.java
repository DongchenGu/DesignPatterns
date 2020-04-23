package 抽象工厂模式.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import 抽象工厂模式.Pizza.Pizza;

public class orderPizza {
 
	//构造器
	public orderPizza (ABSfactory factory){
		setFactory(factory);
	}
	ABSfactory factory;
	
	private  void setFactory(ABSfactory factory) {
		Pizza pizza =null;
		String orderType = ""; //用户输入
		//factory可能是北京的工厂子类也可能是伦敦的工厂子类
		this.factory = factory;
		
		do {
			orderType =getType();
			//factory可能是北京的工厂子类也可能是伦敦的工厂子类
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购失败");
			}
		}while (true);
	}
	
	//写一个方法，动态获取客户订购的pizza种类
		private String getType() {
			try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
			} catch (IOException e) {
			e.printStackTrace();
			return "";}}
}
