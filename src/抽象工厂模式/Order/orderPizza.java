package ���󹤳�ģʽ.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ���󹤳�ģʽ.Pizza.Pizza;

public class orderPizza {
 
	//������
	public orderPizza (ABSfactory factory){
		setFactory(factory);
	}
	ABSfactory factory;
	
	private  void setFactory(ABSfactory factory) {
		Pizza pizza =null;
		String orderType = ""; //�û�����
		//factory�����Ǳ����Ĺ�������Ҳ�������׶صĹ�������
		this.factory = factory;
		
		do {
			orderType =getType();
			//factory�����Ǳ����Ĺ�������Ҳ�������׶صĹ�������
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("����ʧ��");
			}
		}while (true);
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
