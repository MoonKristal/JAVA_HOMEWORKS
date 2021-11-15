package work.home.no_5;

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {

//	1번 문제 
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//	ex.
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8 
//	i 개수 : 2

	public void method1() {

		Scanner sc1 = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 > ");
		String str = sc1.next(); // 입력받은 문자열
		String[] arr = new String[str.length()]; // 배열크기
		int count = 0; // 문자열에 들어가 있는 문자의 개수

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = str.charAt(i) + "";
		}
		System.out.println(Arrays.toString(arr));

		Scanner sc2 = new Scanner(System.in);
		System.out.print("검색할 문자를 입력하세요 > ");
		char ch = sc2.next().charAt(0); // 입력받은 문자
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		for (int i = 0; i <= arr.length - 1; i++) {
			if (str.charAt(i) == ch) { // 입력받은 문자와 인덱스에 있는 문자의 비교
				count++; // 비교후, 같을 경우 +1
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("검색한 문자의 개수 : " + count);
	}

	public void method1_1() {
		int count = 0;
		String id = "";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 > ");
		String str = sc.next();

		System.out.print("문자 > ");
		char c = sc.next().charAt(0);

		char[] ch = new char[str.length()];

		for (int i = 0; i <= ch.length-1; i++) {
			ch[i] = str.charAt(i);
			if(c == ch[i]) {
				count++;
				id += i + " ";
			}
			
			
			
			
			

		}
		System.out.println(str + "에" + c + "가 존재하는 위치(인덱스) : " + id);
		System.out.println(c + "개수 : " + count);
	}
//	2번 문제
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//	ex.
//	정수 : 5
//	배열 0번째 인덱스에 넣을 값 : 4
//	배열 1번째 인덱스에 넣을 값 : -4
//	배열 2번째 인덱스에 넣을 값 : 3
//	배열 3번째 인덱스에 넣을 값 : -3
//	배열 4번째 인덱스에 넣을 값 : 2
//	4 -4 3 -3 2 
//	총 합 : 2

	public void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("설정하고 싶은 배열의 길이(정수)를 입력하세요. > ");
		int lengths = sc.nextInt();
		int[] arr = new int[lengths]; // 입력받은 길이의 배열생성

		for (int i = 0; i <= arr.length - 1; i++) { // 입력받은 배열의 크기만큼 반복문 생성
			Scanner num = new Scanner(System.in);
			System.out.print("배열" + i + "번째 인덱스에 넣을 값을 입력하세요. > ");
			int k = num.nextInt();
			arr[i] = k; // 입력받은 값을 인덱스의 각각 저장
		}

		int sum = 0; // 총 합 초기화
		for (int j = 0; j <= arr.length - 1; j++) {
			sum += arr[j]; // 인덱스에 들어간 값을 반복문 이용해서 sum에 저장
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("입력받은 값의 총 합 : " + sum);
	}

//  3번 문제
//  사용자가 입력한 값이 배열에 있는지 검색하여
//  있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//  단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//  ex.
//  치킨 이름을 입력하세요 : 양념 
//	치킨 이름을 입력하세요 : 불닭
//  양념치킨 배달 가능 불닭치킨은 없는 메뉴입 니다.

	public void method3() {

		String[] menu = { "허니콤보", "스리라차", "맛초킹", "뿌링클" };
		System.out.println(Arrays.toString(menu));

		Scanner sc = new Scanner(System.in);
		System.out.print("주문하실 치킨 이름을 입력하세요 > ");
		String name = sc.next(); // 입력받은 치킨이름 저장

		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(name)) { // 입력받은 치킨의 이름과 인덱스에 저장되어 있는 치킨이름 비교
				System.out.println(name + "치킨 배달 가능"); // 같을 경우 출력
				break;
			} else {
				System.out.println(name + "치킨은 없는 메뉴입니다."); // 다를 경우 출력
				break;
			}
		}
	}

//	4번 문제
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 4
//	****
//	***
//	**
//	*
	public void method4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 *의 개수(정수)를 입력하세요. > ");
		int startNum = sc.nextInt(); // *의 개수 저장

		for (int i = 0; i < startNum; i++) { // 반복문을 이용하여 입력받은 인덱스 수 만큼 별찍기(세로기준)
			System.out.print("*");
			for (int j = i + 1; j < startNum; j++) { // 점점 줄어드는 *의 개수(가로기준)
				System.out.print("*");
			}
			System.out.println();// j가 끝난후 줄바꿈
		}
	}
}
