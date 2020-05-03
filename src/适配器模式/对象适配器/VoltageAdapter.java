package 适配器模式.对象适配器;
//适配器类
public class VoltageAdapter  implements IVoltage5V{

	private Voltage220V volatage220V;
	
	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int dstV =0;
		if (volatage220V != null) {
			int srcV =volatage220V.output220V();//获取220的电压
			System.out.println("使用对象适配器进行转化");
		    dstV =srcV/44;
			System.out.println("适配完成~~");
		}		
		return dstV;
	}
	public VoltageAdapter(Voltage220V volatage220V){
		this.volatage220V =volatage220V;
	}
	
	
}
