package ������ģʽ.�ӿ�������;

public class Client {
		public static void main(String[] args) {
			 ABsAdapter absAdapter = new ABsAdapter() {
				 @Override//ֻ��Ҫ����������Ҫʹ�õķ���
			public void m1() {
				System.out.println("ʹ����M1�ķ���");}
				 };
			absAdapter.m1();	 
				 
		}
}
