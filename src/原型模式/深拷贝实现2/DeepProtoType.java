package 原型模式.深拷贝实现2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable ,Cloneable{

	public String  name;
	public DeepCloneableTarget deepCloneableTarget;
	public DeepProtoType() {
		super();
	}
	
	//深拷贝方式2，通过对象的序列化实现

	public Object deepclone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//创建流对象
		ByteArrayOutputStream bos =null;
		ObjectOutputStream oos =null;
		ByteArrayInputStream bis =null;
		ObjectInputStream ois = null;
		
		try {
			//序列化
			bos =new ByteArrayOutputStream();
			oos =new ObjectOutputStream(bos);
			oos.writeObject(this);
			//反序列化
			bis =new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj =(DeepProtoType) ois.readObject();
			return copyObj;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally {
			try {
				bos.close();
				bis.close();
				oos.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println( e2.getMessage());
			}
		}		
	}	
}
