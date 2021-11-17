package work.home.no_7; // 기능을 담당할 애

public class ChildController {
	// 세개의 숫자의 합과 곱을 계산해서 보여주는 프로그램
	//[필드부]
	private Child c = new Child();
	
	public int calcSum(int x, int y, int z) {
		c.setX(x);
		c.setY(y);
		c.setZ(z);
		
		return c.getX() + c.getY() + c.getZ();
		
	}
	
	public int calcSub(int x, int y, int z) {
		c.setX(x);
		c.setY(y);
		c.setZ(z);
		
		return c.getX() * c.getY() * c.getZ();
	}
	
}

