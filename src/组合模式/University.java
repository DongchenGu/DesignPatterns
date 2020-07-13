package ���ģʽ;
//college���Թ���Department
import java.util.ArrayList;
import java.util.List;

public class University  extends OrganizationComponent{

	
	public University(String name, String des) {
		super(name, des);
	}
	//list�д�ŵ���College
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	@Override//�������university���������ѧԺ
	protected void print() { 
		System.out.println("---------"+getName()+"----------");
		//forѭ������list
		for (OrganizationComponent organizationComponent :organizationComponents ) {
			organizationComponent.print();
		}
		
	}
	@Override
	protected void add(OrganizationComponent organizationComponent) {
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
