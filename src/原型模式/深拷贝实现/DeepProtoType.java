package ԭ��ģʽ.���ʵ��;

import java.io.Serializable;

public class DeepProtoType implements Serializable ,Cloneable{

	public String  name;
	public DeepCloneableTarget deepCloneableTarget;
	public DeepProtoType() {
		super();
	}
	
	//�����ʽ1��ʹ��clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object deep =null;
		//������ɶԻ������͵Ŀ�¡
		deep = super.clone();
		//���������͵����Խ��е�������
		DeepProtoType deepProtoType =(DeepProtoType)deep;
		deepProtoType.deepCloneableTarget =(DeepCloneableTarget)deepCloneableTarget.clone();
		return deepProtoType;
	}
}
