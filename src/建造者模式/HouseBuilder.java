package ������ģʽ;
//����Ľ�����
public abstract class HouseBuilder {

	protected House house =new House();
	//�����������д�ã�����ķ���
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//���췿�ӣ�Ȼ�󽫲�Ʒ����
	public House buildHouse() {	
		return house;
	}
}
