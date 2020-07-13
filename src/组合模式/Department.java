package 组合模式;

public class Department extends OrganizationComponent {
	
			
	public Department(String name,String des) {
		super(name, des);
	}		
	//add和remove方法就不用再写了，因为他是叶子节点
	//集合也不用写了，因为叶子节点没有聚合任何
	
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
