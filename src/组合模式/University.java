package 组合模式;
//college可以管理Department
import java.util.ArrayList;
import java.util.List;

public class University  extends OrganizationComponent{

	
	public University(String name, String des) {
		super(name, des);
	}
	//list中存放的是College
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	@Override//就是输出university里面包含的学院
	protected void print() { 
		System.out.println("---------"+getName()+"----------");
		//for循环遍历list
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
