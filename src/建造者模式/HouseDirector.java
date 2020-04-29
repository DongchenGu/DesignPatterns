package ������ģʽ;
//ָ���������̣����ؾ����Ʒ
public class HouseDirector {

	HouseBuilder houseBuilder =null;
	//����������
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	//ͨ��setter����houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	//���췿�ӵ����̽���ָ����
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
}
