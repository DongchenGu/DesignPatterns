package 工厂方法模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import 简单工厂模式.CheesePizza;
import 简单工厂模式.GreekPizza;
import 简单工厂模式.Pizza;

public abstract class OrderPizza {
	//定义一个抽象方法，让个工厂自己去实现
		abstract 工厂方法模式.Pizza  createPizza(String orderType);
	
	//构造器
	public OrderPizza() {
		工厂方法模式.Pizza pizza = null;
		String orderType;//订购的披萨类型
		do {
			orderType = getType();
			pizza = createPizza(orderType);//抽象的方法由子类工厂实现
			//输出披萨的制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
		
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
