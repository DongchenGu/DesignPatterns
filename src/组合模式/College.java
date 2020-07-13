package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

	public College(String name, String des) {
		super(name, des);
	}
	//list中存放的是department
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	@Override//就是输出university里面包含的系
	protected void print() { 
		System.out.println("---------"+getName()+"----------");
		//for循环遍历list
		for (OrganizationComponent organizationComponent :organizationComponents ) {
			 organizationComponent.print();
		}
		
	}
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		//将来实际业务中university和college的add方法不一定相同
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
