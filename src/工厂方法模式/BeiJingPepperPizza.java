package 工厂方法模式;

public class BeiJingPepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName("北京胡椒披萨");
		// TODO Auto-generated method stub
		System.out.println("北京胡椒披萨-原料准备");
	}
}
