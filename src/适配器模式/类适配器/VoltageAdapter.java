package ÊÊÅäÆ÷Ä£Ê½.ÀàÊÊÅäÆ÷;
//ÊÊÅäÆ÷Àà
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int srcV =output220V();
		int dstV =srcV/44;
		return dstV;
	}
	
	
}
