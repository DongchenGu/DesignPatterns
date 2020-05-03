package 适配器模式.接口适配器;

public class Client {
		public static void main(String[] args) {
			 ABsAdapter absAdapter = new ABsAdapter() {
				 @Override//只需要覆盖我们想要使用的方法
			public void m1() {
				System.out.println("使用了M1的方法");}
				 };
			absAdapter.m1();	 
				 
		}
}
