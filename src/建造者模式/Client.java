package ������ģʽ;

public class Client {
public static void main(String[] args) {
	//����ͨ����
	CommonHouse commonHouse =new CommonHouse();
	//׼���������ӵ�ָ����
	HouseDirector houseDirector = new HouseDirector(commonHouse);
	//��ɷ��ӣ����ز�Ʒ
	House house = houseDirector.constructHouse();
}
}
