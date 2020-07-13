package 组合模式;

public class Client {

	public static void main(String[] args) {
		//从大到小创建对象  先创建学校
		OrganizationComponent university =  new University("青岛理工大学", "山东省最早开设土木工程的院校");
		//创建学院
		OrganizationComponent EarthWorkCollege = new College("土木工程学院", "土木工程学院");
		OrganizationComponent ArchitectureCollege = new College("建筑与城乡规划学院", "建筑与城乡规划学院");
	
	   //创建学院下的各个系
		EarthWorkCollege.add(new Department("城市地下空间", "土木工程地下方向"));
		EarthWorkCollege.add(new Department("桥梁工程", "桥梁建筑"));
		ArchitectureCollege.add(new Department("建筑学","建筑外观设计"));
		ArchitectureCollege.add(new Department("风景园林","风景园林设计"));
		
		//将学院加入到学校中
		university.add(EarthWorkCollege);
		university.add(ArchitectureCollege);
	   //打印
		//university.print();
		ArchitectureCollege.print();
	}
}
