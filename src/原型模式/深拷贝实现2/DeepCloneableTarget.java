package 原型模式.深拷贝实现2;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
/**
 * 
 */
	private static final long serialVersionUID = 1L;
	private String cloneName;
	private String cloneClass;
	public DeepCloneableTarget (String cloneName,String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
}
