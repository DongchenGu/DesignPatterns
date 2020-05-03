package 适配器模式.对象适配器;

public class Phone {
	// 充电
	public void charging(IVoltage5V ivoltage5V) {
		if (ivoltage5V.output5V()==5) {
			System.out.println("电压为5V~可以充电了");
		}else {
			System.out.println("电压过高~无法充电");
		}
	}
}
