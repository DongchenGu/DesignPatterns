package ���󹤳�ģʽ.Order;

import ���󹤳�ģʽ.Pizza.Pizza;

//����һ�����󹤳�ģʽ�ĳ���� (�ӿ�)
public interface ABSfactory {
     //������Ĺ�������������ʵ��
	public Pizza createPizza(String orderType);
	
}
