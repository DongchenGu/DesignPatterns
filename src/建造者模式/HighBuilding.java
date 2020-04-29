package 建造者模式;

public class HighBuilding  extends HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("高楼的地基打--100米");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("高楼砌墙200米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("高楼的屋顶是玻璃屋顶");
	}

	
}
