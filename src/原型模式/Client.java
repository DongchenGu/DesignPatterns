package 原型模式;

public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom", 2, "white");
		Sheep sheep2= (Sheep)sheep.clone();//克隆
		Sheep sheep3= (Sheep)sheep.clone();//克隆
		Sheep sheep4= (Sheep)sheep.clone();//克隆
		
		System.out.println("sheep2::"+sheep2.toString());
	}
}
