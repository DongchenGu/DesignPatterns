package ������ģʽ.����������;
//��������
public class VoltageAdapter  implements IVoltage5V{

	private Voltage220V volatage220V;
	
	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int dstV =0;
		if (volatage220V != null) {
			int srcV =volatage220V.output220V();//��ȡ220�ĵ�ѹ
			System.out.println("ʹ�ö�������������ת��");
		    dstV =srcV/44;
			System.out.println("�������~~");
		}		
		return dstV;
	}
	public VoltageAdapter(Voltage220V volatage220V){
		this.volatage220V =volatage220V;
	}
	
	
}
