package �������ģʽ;

public class ˫�ؼ�� {
public static void main(String[] args) {
	System.out.println("˫�ؼ�飺");
	Singleton5 instance1= Singleton5.getInstance();
	Singleton5 instance2= Singleton5.getInstance();
	System.out.println(instance1 == instance2);//true
	System.out.println("instance1.hashCode():"+instance1.hashCode());
	System.out.println("instance2.hashCode():"+instance2.hashCode());
}
}

class Singleton5{//����DoubleCheck �Ƽ�ʹ��
    private Singleton5(){		
	}
	private static volatile Singleton5 instance;
	//�ṩһ����̬�Ĺ��з�����˫�ؼ�飬����̰߳�ȫ���⣬ͬʱ�������������
	//ͬʱ��֤��Ч��
	public static Singleton5 getInstance(){//������ͬ������Ĵ������̰߳�ȫ
		if(instance == null) {
			synchronized (Singleton5.class) {
				if(instance == null) {
				instance =new Singleton5();}
			}
		}
		return instance;
	}
		
}
