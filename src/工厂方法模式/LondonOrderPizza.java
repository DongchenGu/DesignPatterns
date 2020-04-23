package 工厂方法模式;

public class LondonOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza  pizza =null;
	    if(orderType.equals("cheese")) {
		pizza = new LondonCheesePizza();
	    }else if (orderType.equals("pepper")) {
			pizza = new LondonPepperPizza();
		}
		return pizza;
	}
	
}
