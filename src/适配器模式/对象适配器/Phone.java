package ������ģʽ.����������;

public class Phone {
	// ���
	public void charging(IVoltage5V ivoltage5V) {
		if (ivoltage5V.output5V()==5) {
			System.out.println("��ѹΪ5V~���Գ����");
		}else {
			System.out.println("��ѹ����~�޷����");
		}
	}
}
