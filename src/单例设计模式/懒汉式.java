package �������ģʽ;

public class ����ʽ {

	public static void main(String[] args) {
		Singleton3 instance1= Singleton3.getInstance();
		Singleton3 instance2= Singleton3.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode():"+instance1.hashCode());
		System.out.println("instance2.hashCode():"+instance2.hashCode());
	}
}

class Singleton3{//�����̲߳���ȫ����ʽ
	
	private Singleton3(){
		
	}
	private static Singleton3 instance;
	//�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ�Ż�ȥ����instance
	public static Singleton3 getInstance(){
		if(instance == null) {
			instance =new Singleton3();
		}
		return instance;
	}
}

class Singleton4{//�����̰߳�ȫ����ʽ(�̰߳�ȫ��ͬ������)
    private Singleton4(){
		
	}
	private static Singleton4 instance;
	//�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ�Ż�ȥ����instance
	public static synchronized Singleton4 getInstance(){//������ͬ������Ĵ������̰߳�ȫ
		if(instance == null) {
			instance =new Singleton4();
		}
		return instance;
	}
		
}
