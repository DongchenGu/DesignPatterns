package ���ģʽ;

public class Department extends OrganizationComponent {
	
			
	public Department(String name,String des) {
		super(name, des);
	}		
	//add��remove�����Ͳ�����д�ˣ���Ϊ����Ҷ�ӽڵ�
	//����Ҳ����д�ˣ���ΪҶ�ӽڵ�û�оۺ��κ�
	
	@Override
	protected void print() {
	System.out.println(getName());
		
	}
	@Override
	public String getName() {

	return super.getName();
	}
	@Override
	public String getDes() {	
	return super.getDes();
	}
}
