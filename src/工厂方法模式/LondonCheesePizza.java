package 工厂方法模式;

public class LondonCheesePizza extends Pizza{

	@Override
	public void prepare() {
		setName("伦敦奶酪披萨");
		// TODO Auto-generated method stub
		System.out.println("伦敦奶酪披萨-原料准备");
	}
}
