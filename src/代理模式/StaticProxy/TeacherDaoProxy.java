package 代理模式.StaticProxy;
//静态代理对象
public class TeacherDaoProxy implements ITeacherDao {

	private ITeacherDao target;//目标对象，通过接口来聚合
	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		super();
		this.target = target;
	}
	
	@Override
	public void teach() {
			System.out.println("代理开始-----");
			target.teach();
			System.out.println("代理结束-----");	
	}

}
