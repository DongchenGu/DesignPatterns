package 单例设计模式;

public class 静态内部类 {
public static void main(String[] args) {
	System.out.println("使用静态内部类完成单例模式：");
	Singleton6 instance1= Singleton6.getInstance();
	Singleton6 instance2= Singleton6.getInstance();
	System.out.println(instance1 == instance2);//true
	System.out.println("instance1.hashCode():"+instance1.hashCode());
	System.out.println("instance2.hashCode():"+instance2.hashCode());
}
}

class Singleton6{
	private Singleton6() {//构造器私有化
		
	}
	//写一个静态内部类,该类中有一个静态属性Singleton6
	//加载外部类的时候，不会自动加载静态内部类，从而实现了延迟加载
	//静态内部类的加载时线程安全的，这个时JVM替我们做的
	private static class SingletonInstance{
		private static final Singleton6 INSTANCE =new Singleton6();  
	}
	//提供一个静态共有方法,直接返回SingletonInstance.INSTANCE
	public static synchronized Singleton6 getInstance() {
		return SingletonInstance.INSTANCE;
	}
}