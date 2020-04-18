package �������ģʽ;

public class ����ʽ {

	public static void main(String[] args) {
		Singleton2 instance1= Singleton2.getInstance();
		Singleton2 instance2= Singleton2.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode():"+instance1.hashCode());
		System.out.println("instance2.hashCode():"+instance2.hashCode());
	}
}
//����ʽ����̬������������̬��������ʽ
class Singleton{
	//1��������˽�л����ⲿ����new
	private Singleton() {
		
	}
	//�ڱ����ڲ���������ʵ��
	private final static Singleton instance =new Singleton();
	//�ṩһ�������ľ�̬����������ʵ������
	public static Singleton getInstance( ) {
		return instance;
	}
}


class Singleton2{//������̬��������ʽ
	//1��������˽�л����ⲿ����new
		private Singleton2() {
			
		}
		//�ڱ����ڲ���������ʵ��
		private final static Singleton2 instance;
		
		static {//�ھ�̬������д�����������
			instance = new Singleton2();
		}
		//�ṩһ�������ľ�̬����������ʵ������
		public static Singleton2 getInstance( ) {
			return instance;
		}
}