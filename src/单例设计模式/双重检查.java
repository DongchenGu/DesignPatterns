package 单例设计模式;

public class 双重检查 {
public static void main(String[] args) {
	System.out.println("双重检查：");
	Singleton5 instance1= Singleton5.getInstance();
	Singleton5 instance2= Singleton5.getInstance();
	System.out.println(instance1 == instance2);//true
	System.out.println("instance1.hashCode():"+instance1.hashCode());
	System.out.println("instance2.hashCode():"+instance2.hashCode());
}
}

class Singleton5{//单例DoubleCheck 推荐使用
    private Singleton5(){		
	}
	private static volatile Singleton5 instance;
	//提供一个静态的公有方法，双重检查，解决线程安全问题，同时解决懒加载问题
	//同时保证了效率
	public static Singleton5 getInstance(){//加入了同步处理的代码解决线程安全
		if(instance == null) {
			synchronized (Singleton5.class) {
				if(instance == null) {
				instance =new Singleton5();}
			}
		}
		return instance;
	}
		
}
