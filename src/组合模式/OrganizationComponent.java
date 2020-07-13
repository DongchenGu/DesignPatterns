package 组合模式;

public abstract class OrganizationComponent {

	private  String name;//说明
	private  String des;//说明
	
	
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	//print方法，做成抽象，因为叶子节点也有这个方法
	protected  abstract void print();
    protected void add(OrganizationComponent organizationComponent) {
		//默认实现
    	throw new UnsupportedOperationException();
	}
    protected void remove(OrganizationComponent organizationComponent) {
		//默认实现
    	throw new UnsupportedOperationException();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
}
