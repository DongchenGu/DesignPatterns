package 单例设计模式;

public class 饿汉式 {

	public static void main(String[] args) {
		Singleton2 instance1= Singleton2.getInstance();
		Singleton2 instance2= Singleton2.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode():"+instance1.hashCode());
		System.out.println("instance2.hashCode():"+instance2.hashCode());
	}
}
//饿汉式（静态变量）单例静态常量饿汉式
class Singleton{
	//1：构造器私有化，外部不能new
	private Singleton() {
		
	}
	//在本类内部创建对象实例
	private final static Singleton instance =new Singleton();
	//提供一个公共的静态方法，返回实例对象
	public static Singleton getInstance( ) {
		return instance;
	}
}


class Singleton2{//单例静态代码块饿汉式
	//1：构造器私有化，外部不能new
		private Singleton2() {
			
		}
		//在本类内部创建对象实例
		private final static Singleton2 instance;
		
		static {//在静态代码块中创建单例对象
			instance = new Singleton2();
		}
		//提供一个公共的静态方法，返回实例对象
		public static Singleton2 getInstance( ) {
			return instance;
		}
}