package 简单工厂模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import 简单工厂模式.CheesePizza;
import 简单工厂模式.GreekPizza;
import 简单工厂模式.Pizza;

public class OrderPizza {

	/**
	//构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//订购的披萨类型
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza =new GreekPizza();
				pizza.setName("希腊披萨");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			}else {
				break;
			}
			//输出披萨的制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
		
	}
	*/
	
	//构造器
	
	SimpleFactory simpleFactory;
	Pizza pizza =null;
	
	//构造器
	public OrderPizza(SimpleFactory simpleFactory) {//这里用的是聚合的方式
		setFactory(simpleFactory);
	}
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType;//等用户输入
		this.simpleFactory =simpleFactory;//设置简单工厂对象
		do {
			orderType =getType();
			pizza =this.simpleFactory.createPizza(orderType);
			if(pizza!=null) {//输出pizza
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("没有这种pizza，订购失败");
				break;
			}
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
