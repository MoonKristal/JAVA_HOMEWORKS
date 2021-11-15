package work.home.no_5;

public class Run_Phone {

	public static void main(String[] args) {
		
			Phone it = new Phone();
			
			it.name = "갤럭시 노트 8";
			it.color = "오키드 그레이";
			it.cases = "연보라색 카드케이스";
			it.backgroundImage = "강아지";
			it.brightness = 60;
			
			System.out.println("제 핸드폰은 " + it.name + "이고 색상은 " + it.color + "입니다. 현재 끼우는 케이스는 "
								+ it.cases + "이고 배경하면은 " + it.backgroundImage + "가 웃고있는 사진입니다.");
			
			it.up();
			it.up();
			System.out.println("변경된 배경화면 밝기는 " + it.brightness + "입니다.");

			it.down();
			System.out.println("변경된 배경화면 밝기는 " + it.brightness + "입니다.");
			
	}

}
