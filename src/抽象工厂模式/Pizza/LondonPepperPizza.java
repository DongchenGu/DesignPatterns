package 抽象工厂模式.Pizza;

public class LondonPepperPizza  extends Pizza{
	@Override
	public void prepare() {
		setName("伦敦胡椒披萨");
		// TODO Auto-generated method stub
		System.out.println("伦敦胡椒披萨-原料准备");
	}
}
