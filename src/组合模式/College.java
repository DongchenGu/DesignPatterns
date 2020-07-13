package ���ģʽ;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

	public College(String name, String des) {
		super(name, des);
	}
	//list�д�ŵ���department
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	@Override//�������university���������ϵ
	protected void print() { 
		System.out.println("---------"+getName()+"----------");
		//forѭ������list
		for (OrganizationComponent organizationComponent :organizationComponents ) {
			 organizationComponent.print();
		}
		
	}
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		//����ʵ��ҵ����university��college��add������һ����ͬ
		organizationComponents.add(organizationComponent);
	}
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);		
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
