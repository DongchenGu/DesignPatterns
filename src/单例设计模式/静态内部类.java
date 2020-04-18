package �������ģʽ;

public class ��̬�ڲ��� {
public static void main(String[] args) {
	System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ��");
	Singleton6 instance1= Singleton6.getInstance();
	Singleton6 instance2= Singleton6.getInstance();
	System.out.println(instance1 == instance2);//true
	System.out.println("instance1.hashCode():"+instance1.hashCode());
	System.out.println("instance2.hashCode():"+instance2.hashCode());
}
}

class Singleton6{
	private Singleton6() {//������˽�л�
		
	}
	//дһ����̬�ڲ���,��������һ����̬����Singleton6
	//�����ⲿ���ʱ�򣬲����Զ����ؾ�̬�ڲ��࣬�Ӷ�ʵ�����ӳټ���
	//��̬�ڲ���ļ���ʱ�̰߳�ȫ�ģ����ʱJVM����������
	private static class SingletonInstance{
		private static final Singleton6 INSTANCE =new Singleton6();  
	}
	//�ṩһ����̬���з���,ֱ�ӷ���SingletonInstance.INSTANCE
	public static synchronized Singleton6 getInstance() {
		return SingletonInstance.INSTANCE;
	}
}