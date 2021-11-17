package work.home.no_7;

import java.util.Scanner;

public class MainMenu {
	//[필드부]
	private Scanner sc = new Scanner(System.in);
	private ChildController cc = new ChildController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("----메뉴----");
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("9. 나가기");
			System.out.print("메뉴번호 입력 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : sum();
				break;
			case 2 : times();
				break;
			case 9 : return;
			default:
				System.out.println("응 그런 숫자 없어~");
			}
			
		}
		
	}
	public void sum() {
		System.out.print("첫 번째 정수 ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수 ");
		int y = sc.nextInt();
		System.out.print("세 번째 정수 ");
		int z = sc.nextInt();
		int result = cc.calcSum(x, y, z);
		System.out.println("세 수의 합 : " + result);
	}
	
	public void times() {
		System.out.print("첫 번째 정수 ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수 ");
		int y = sc.nextInt();
		System.out.print("세 번째 정수 ");
		int z = sc.nextInt();
		int result = cc.calcSub(x, y, z);
		System.out.println("세 수의 곱 : " + result);
	}
	
	
}
