package �Ž�ģʽ;

public class UpRightPhone extends Phone{

	public UpRightPhone(Brand brand) {
		super(brand);
	}
	public void open() {
		super.open();
		System.out.println("ֱ����ʽ�ֻ�");
	}
	public void Close() {
		super.close();
		System.out.println("ֱ����ʽ�ֻ�");
	}
	public void call() {
		super.call();
		System.out.println("ֱ����ʽ�ֻ�");
	}

     
}
