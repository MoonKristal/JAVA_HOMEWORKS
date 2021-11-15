package work.home.no_5;

public class Run_Coffee {

	public static void main(String[] args) {

		Coffee holic = new Coffee();

		holic.name = "아메리카노";
		holic.size = "Tall";
		holic.taste = "쓴맛";
		holic.add = "시럽";
		holic.strong = 1;
		
		System.out.println("제가 자주 마시는 커피는 " + holic.size + "사이즈의 " + holic.name + "입니다." 
							+ holic.taste + "을 즐기고 싶어 " + holic.add + "은 추가하지 않습니다.");
		holic.shot();
		System.out.println("커피의 진하기는 " + holic.strong + "입니다.");
		
		holic.water();
		System.out.println("커피의 진하기는 " + holic.strong + "입니다.");

	}

}
