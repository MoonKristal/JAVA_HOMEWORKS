package work.home.no_9;

import java.util.Scanner;

public class Level extends MathS{
	
	MathS ms = new MathS();
	
	public void askLevel() {

		System.out.println("----- 재미있는 사칙연산 게임 -----");
		System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
		System.out.println("# 엔터를 누르면 시작합니다");
		String enter = sc.nextLine();
		System.out.println("============================\n\n");

		System.out.println("# 난이도를 입력하세요! [상, 중, 하]");
		System.out.println(">> ");
		String n = sc.next();

		if (n.equals("상")) {
			System.out.println("상급 난이도입니다. 1~1000범위로 출제됩니다.");
			for(i = 1; i < 100; i++ ) {
				num1 = (int) (Math.random() * 1000) + 1;
				num2 = (int) (Math.random() * 1000) + 1;
				ms.numbers(num1,num2,i);
			}
			
		}else if (n.equals("중")) {
			for(i = 1; i < 100; i++ ) {
				num1 = (int) (Math.random() * 100) + 1;
				num2 = (int) (Math.random() * 100) + 1;
				ms.numbers(num1,num2,i);
				
			}
		}else if (n.equals("하")) {
			for(i = 1; i < 100; i++ ) {
				num1 = (int) (Math.random() * 20) + 1;
				num2 = (int) (Math.random() * 20) + 1;
				ms.numbers(num1,num2,i);
			}
		}
		
	}
	}
