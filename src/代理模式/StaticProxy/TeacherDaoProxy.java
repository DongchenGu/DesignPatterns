package ����ģʽ.StaticProxy;
//��̬�������
public class TeacherDaoProxy implements ITeacherDao {

	private ITeacherDao target;//Ŀ�����ͨ���ӿ����ۺ�
	//������
	public TeacherDaoProxy(ITeacherDao target) {
		super();
		this.target = target;
	}
	
	@Override
	public void teach() {
			System.out.println("����ʼ-----");
			target.teach();
			System.out.println("�������-----");	
	}

}
