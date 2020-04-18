package 单例设计模式;

public class 懒汉式 {

	public static void main(String[] args) {
		Singleton3 instance1= Singleton3.getInstance();
		Singleton3 instance2= Singleton3.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode():"+instance1.hashCode());
		System.out.println("instance2.hashCode():"+instance2.hashCode());
	}
}

class Singleton3{//单例线程不安全懒汉式
	
	private Singleton3(){
		
	}
	private static Singleton3 instance;
	//提供一个静态的公有方法，当使用到该方法时才会去创建instance
	public static Singleton3 getInstance(){
		if(instance == null) {
			instance =new Singleton3();
		}
		return instance;
	}
}

class Singleton4{//单例线程安全懒汉式(线程安全，同步方法)
    private Singleton4(){
		
	}
	private static Singleton4 instance;
	//提供一个静态的公有方法，当使用到该方法时才会去创建instance
	public static synchronized Singleton4 getInstance(){//加入了同步处理的代码解决线程安全
		if(instance == null) {
			instance =new Singleton4();
		}
		return instance;
	}
		
}
