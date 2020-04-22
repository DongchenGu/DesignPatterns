package 简单工厂模式;

public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("给制作奶酪披萨准备原材料");
	}
}


