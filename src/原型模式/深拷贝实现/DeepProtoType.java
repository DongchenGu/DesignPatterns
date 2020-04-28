package 原型模式.深拷贝实现;

import java.io.Serializable;

public class DeepProtoType implements Serializable ,Cloneable{

	public String  name;
	public DeepCloneableTarget deepCloneableTarget;
	public DeepProtoType() {
		super();
	}
	
	//深拷贝方式1，使用clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object deep =null;
		//这里完成对基本类型的克隆
		deep = super.clone();
		//对引用类型的属性进行单独处理
		DeepProtoType deepProtoType =(DeepProtoType)deep;
		deepProtoType.deepCloneableTarget =(DeepCloneableTarget)deepCloneableTarget.clone();
		return deepProtoType;
	}
}
