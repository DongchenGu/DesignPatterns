package ԭ��ģʽ.���ʵ��2;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
	   DeepProtoType p = new DeepProtoType();
		p.name ="�ɽ�";
		p.deepCloneableTarget =new DeepCloneableTarget("��ţ", "��ţ����");
        
		//�÷�ʽ2��ɿ���
        DeepProtoType p2 = (DeepProtoType)p.deepclone();
		System.out.println("P.name: "+p.name+"P.deepCloneableTarget: "+p.deepCloneableTarget.hashCode());
		System.out.println("P2.name: "+p2.name+"P2.deepCloneableTarget: "+p2.deepCloneableTarget.hashCode());	
	}
}
