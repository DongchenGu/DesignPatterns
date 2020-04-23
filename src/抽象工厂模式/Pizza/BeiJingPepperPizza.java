package 抽象工厂模式.Pizza;

public class BeiJingPepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName("北京胡椒披萨");
		// TODO Auto-generated method stub
		System.out.println("北京胡椒披萨-原料准备");
	}
}
