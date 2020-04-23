package 抽象工厂模式.Pizza;



public class BeiJingCheesePizza extends 抽象工厂模式.Pizza.Pizza{
 
	@Override
	public void prepare() {
		setName("北京奶酪披萨");
		// TODO Auto-generated method stub
		System.out.println("北京奶酪披萨原料准备");
	}
	
}
