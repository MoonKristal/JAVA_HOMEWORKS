package work.home.no_3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	
	public void method1() {
		
		// 1번 숙제
		
		// 정수 두개와 연산자를 입력받고 입력된 연산자에 따라 알맞은 결과를 출력!
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 입력될 떄까지 무한 반복하며
		// exit가 입력되면 "프로그램을 종료합니다."를 출력하고 종료합니다
		// 또한 연산자가 나누기이면서 두번째 정수가 0으로 들어요면
		// "0으로 나눌수 없습니다. 다시 입력해 주세요." 를 출력하며,
		// 없는 연산자가 들어올시 "없는 연산자입니다. 다시 입력해 주세요."라고 출력하고
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		// 연산자 (+,-,*,/,%) : +
		// 정수1 : 10
		// 정수2 : 4
		// 10+4=14
		
		// 연산자(+,-,*,/,%) : ^
		// 정수 : 10
		// 정수2 : 4
		// 없는 연산자입니다. 다시 입력해주세요
		
 
		// 연산자(+, -, *, /, %) : exit
		// 프로그램을 종료합니다.
		
		// 연산자(+, -, *, /, %) : /
		// 정수 1 : 10
		// 정수 2 : 0
		// 0으로 나눌 수 없습니다. 다시 입력해주세요.
		
		
		
		Scanner sc = new Scanner(System.in);
		for(;;) {

			System.out.println("정수1을 입력하세요 > ");
			int num1 = sc.nextInt();
			System.out.println("정수2을 입력하세요 > ");
			int num2 = sc.nextInt();
			System.out.println("연산자를 입력하세요 > ");
			String str = sc.next();	
			
			if(str.equals("exit")){
				System.out.println("프로그램을 종료합니다.");
				return;
			}else if(!(str.equals("+") ||str.equals("-")||str.equals("*")||str.equals("/")||str.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}else if(num1==0 || num2==0){
				System.out.println("0으로 나눌수없습니다. 다시 입력해주세요.");
				continue;
			}

			int result;
			
			if(str.equals("+")) {
				result = num1+num2;
			}else if(str.equals("-")) {
				result = num1-num2;
			}else if(str.equals("*")) {
				result = num1*num2;
			}else if(str.equals("/")) {
				result = num1/num2;
			}else{
				result = num1%num2;
			}
			System.out.printf("%d %s %d = %d", num1,str,num2,result);
			break;
		}
	}
	
	public void method1_2() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+,-,*,/,%) : "); // "exit"입력하면 프로그램 종료
			String p = sc.next();
			
			if(p.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			System.out.println("정수1 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 입력 : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			switch(p) {
			case "+": result = num1 + num2; 
				break;
			case "-": result = num1 - num2; 
				break;
			case "*": result = num1 * num2; 
				break;
			case "/": if(num2 ==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						}else {
							result = num1 / num2;
						}
				break;
			case "%": result = num1 % num2; 
				break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			System.out.println(result);
		}
	}
	
	
	
		// 2번 숙제		
		//2번 공차만들기
	
	
		//	사용자로부터 시작 숫자와 공차를 입력 받아
		//	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//	단, 출력되는 숫자는 총 10개입니다.
		//	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		//	ex) 2, 7, 12, 17, 22 …
		//   5   5   5   5
	
	
		//ex.
		// 시작 숫자 : 4
		// 공차 : 3
		// 4 7 10 13 16 19 22 25.....
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("숫자를 입력해주세요. > ");
		int i = sc.nextInt();
		arr[0] = i;
		
		System.out.println("공차를 입력해주세요 >");
		int j = sc.nextInt();
		
		for(int k = 1; k < arr.length; k++) {
			arr[k] = i+j;
			j+=3;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void method2_1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작숫자  : ");
		int num = sc.nextInt();
		System.out.println("공차 : ");
		int gongcha = sc.nextInt();
		
		int sum = num; // 합계를 담을 sum이라는 변수에 초기값 num의 값을 대입
		String str = ""; // 초기값 num을 제외한 나머지 결과값을 담을 str이라는 변수를 선언
		
		for(int i = 1; i <= 10; i++) {
			sum += gongcha;
			str += sum+(" ");
		}
		System.out.println(num+" "+str);
	}
}