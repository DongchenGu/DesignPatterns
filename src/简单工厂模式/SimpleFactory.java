package �򵥹���ģʽ;
//�򵥹�����
public class SimpleFactory {

	public Pizza createPizza(String orderType){
		Pizza pizza  =null;
		System.out.println("ʹ�ü򵥹���ģʽ");
		if(orderType.equals("greek")) {
			pizza =new GreekPizza();
			pizza.setName("ϣ������");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("��������");
		}
		
		return pizza;
	}
}
