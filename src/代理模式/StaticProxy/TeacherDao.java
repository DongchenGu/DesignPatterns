package 代理模式.StaticProxy;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
     System.out.println("老师授课中--------------");
	}

}
