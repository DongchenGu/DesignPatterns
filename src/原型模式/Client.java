package ԭ��ģʽ;

public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom", 2, "white");
		Sheep sheep2= (Sheep)sheep.clone();//��¡
		Sheep sheep3= (Sheep)sheep.clone();//��¡
		Sheep sheep4= (Sheep)sheep.clone();//��¡
		
		System.out.println("sheep2::"+sheep2.toString());
	}
}
