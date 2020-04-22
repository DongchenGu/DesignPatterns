package �򵥹���ģʽ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import �򵥹���ģʽ.CheesePizza;
import �򵥹���ģʽ.GreekPizza;
import �򵥹���ģʽ.Pizza;

public class OrderPizza {

	/**
	//������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//��������������
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza =new GreekPizza();
				pizza.setName("ϣ������");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("��������");
			}else {
				break;
			}
			//�����������������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
		
	}
	*/
	
	//������
	
	SimpleFactory simpleFactory;
	Pizza pizza =null;
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {//�����õ��Ǿۺϵķ�ʽ
		setFactory(simpleFactory);
	}
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType;//���û�����
		this.simpleFactory =simpleFactory;//���ü򵥹�������
		do {
			orderType =getType();
			pizza =this.simpleFactory.createPizza(orderType);
			if(pizza!=null) {//���pizza
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("û������pizza������ʧ��");
				break;
			}
		}while(true);
		
	}	
	//дһ����������̬��ȡ�ͻ�������pizza����
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
