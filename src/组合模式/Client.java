package ���ģʽ;

public class Client {

	public static void main(String[] args) {
		//�Ӵ�С��������  �ȴ���ѧУ
		OrganizationComponent university =  new University("�ൺ����ѧ", "ɽ��ʡ���翪����ľ���̵�ԺУ");
		//����ѧԺ
		OrganizationComponent EarthWorkCollege = new College("��ľ����ѧԺ", "��ľ����ѧԺ");
		OrganizationComponent ArchitectureCollege = new College("���������滮ѧԺ", "���������滮ѧԺ");
	
	   //����ѧԺ�µĸ���ϵ
		EarthWorkCollege.add(new Department("���е��¿ռ�", "��ľ���̵��·���"));
		EarthWorkCollege.add(new Department("��������", "��������"));
		ArchitectureCollege.add(new Department("����ѧ","����������"));
		ArchitectureCollege.add(new Department("�羰԰��","�羰԰�����"));
		
		//��ѧԺ���뵽ѧУ��
		university.add(EarthWorkCollege);
		university.add(ArchitectureCollege);
	   //��ӡ
		//university.print();
		ArchitectureCollege.print();
	}
}
