package 桥接模式;

import java.io.Closeable;

public class FoldedPhone extends Phone{

	public FoldedPhone(Brand brand) {
		super(brand);
	}
	public void open() {
		super.open();
		System.out.println("折叠样式手机");
	}
	public void Close() {
		super.close();
		System.out.println("折叠样式手机");
	}
	public void call() {
		super.call();
		System.out.println("折叠样式手机");
	}
}
