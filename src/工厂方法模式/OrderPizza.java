package ��������ģʽ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import �򵥹���ģʽ.CheesePizza;
import �򵥹���ģʽ.GreekPizza;
import �򵥹���ģʽ.Pizza;

public abstract class OrderPizza {
	//����һ�����󷽷����ø������Լ�ȥʵ��
		abstract ��������ģʽ.Pizza  createPizza(String orderType);
	
	//������
	public OrderPizza() {
		��������ģʽ.Pizza pizza = null;
		String orderType;//��������������
		do {
			orderType = getType();
			pizza = createPizza(orderType);//����ķ��������๤��ʵ��
			//�����������������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
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
