package 原型模式.深拷贝实现;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		p.name ="松江";
		p.deepCloneableTarget =new DeepCloneableTarget("大牛", "大牛的类");
        
		//用方式1完成拷贝
		DeepProtoType p2 =(DeepProtoType)p.clone();
		System.out.println("P.name: "+p.name+"P.deepCloneableTarget: "+p.deepCloneableTarget.hashCode());
		System.out.println("P2.name: "+p2.name+"P2.deepCloneableTarget: "+p2.deepCloneableTarget.hashCode());	
	}
}
