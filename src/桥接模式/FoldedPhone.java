package �Ž�ģʽ;

import java.io.Closeable;

public class FoldedPhone extends Phone{

	public FoldedPhone(Brand brand) {
		super(brand);
	}
	public void open() {
		super.open();
		System.out.println("�۵���ʽ�ֻ�");
	}
	public void Close() {
		super.close();
		System.out.println("�۵���ʽ�ֻ�");
	}
	public void call() {
		super.call();
		System.out.println("�۵���ʽ�ֻ�");
	}
}
