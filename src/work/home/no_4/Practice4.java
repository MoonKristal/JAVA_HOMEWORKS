package work.home.no_4;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4{
	// 1번 문제 !

	// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
	// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	// ex.
	// 5 3 2 7 4 8 6 10 9 10
	// 최대값 : 10
	// 최소값 : 2

	public void randomArrayMaxMin() {

		int[] random = new int[10]; // 10칸의 배열 생성
		int min = random[0]; // 최소값을 인덱스0의 값으로 초기화
		int max = random[0];

		for (int i = 0; i <= random.length - 1; i++) {
			random[i] = (int) (Math.random() * 10) + 1; // 1~10의 난수생성
			if (random[0] < random[i]) { // 인덱스의 값을 비교해서 더 큰값을 max에 대입
				max = random[i];
			} else {
				min = random[i];
			}
		}
		System.out.println(Arrays.toString(random));
		System.out.println("난수배열의 최소값 : " + min);
		System.out.println("난수배열의 최대값 : " + max);

//		System.out.println("---------------");
//		for (int i = 0; i <= random.length - 1; i++) {
//			random[i] = (int) (Math.random() * 10) + 1;
//			System.out.print(random[i] + " ");
//		}
//		int min = random[0]; // 최소값을 인덱스0의 값으로 초기화
//		int max = random[0];
//
//		for (int i = 0; i <= random.length - 1; i++) {
//			if (max < random[i]) { // 인덱스의 값을 비교해서 더 큰값을 max에 대입
//				max = random[i];
//			} else {
//				min = random[i];
//
//			}
//		}
	}

	// 2번 문제 !

	// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 출력하세요.
	// ex.
	// 39 1 41 34 2 27

	public void pleaseGiveMeAWish() {

		int[] rotto = new int[6];

		for (int i = 0; i <= rotto.length - 1; i++) {
			rotto[i] = (int) (Math.random() * 45) + 1; // 1~45의 로또번호 랜덤 생성
			for (int j = 0; j < i; j++) { // 중복된 값 제거
				if (rotto[i] == rotto[j]) { // 중복된 값이 있을 경우 i--;를 해줘서 다시 인덱스 값을 저장
					i--;
				}
			}
		}
		Arrays.sort(rotto); // 정렬
		System.out.println(Arrays.toString(rotto));

		System.out.println("------------------");

//		int[] rotto = new int[6];
//
//		for (int i = 0; i <= rotto.length - 1; i++) {
//			rotto[i] = (int) (Math.random() * 45) + 1;
//			// 내가 지금 뽑아놓은 숫자만큼!
//			if (i > 0) {
//				// j가 i가 될때까지 반복
//				for (int j = 0; j < i; j++) {
//					if (rotto[i] == rotto[j]) {
//						// 뽑았어? 그럼 다시 뽑아
//						i--;
//						break;
//					}
//				}
//			}
//		}
//		Arrys.sort(rotto);
//		System.out.println(Arrays.toString(rotto));

	}

// 3번 문제 !

// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
// 문자의 개수와 함께 출력하세요.
// ex.
// 문자열 : application
// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
// 중복되지 않는 문자 개수 : 8

	public void anger() {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("영어단어를 입력하세요 > ");
//		String eng = sc.next();
//		String[] word = new String[11]; // 0~10칸의 배열 생성
//
//		int count = 0; // 중복되지 않는 문자의 개수 합
//
//		for (int i = 0; i <= word.length - 1; i++) {
//			word[i] = eng.charAt(i) + ""; // 입력받은 영어단어의 알파벳을 뽑아 String형으로 만들어서 word배열에 저장
//			if ((i + 1) == word.length) { // 중복되지않는 문자의 개수를 구하고 싶었으나..
//				break;
//			} else if (word[i] != word[i + 1]) { // i값과 i+1값 비교
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(word));
//		System.out.println(count);
		
		// 중복이지 않은 문자 갯수 -> 입력받은 문자 길이에서 중복된 문자의 갯수를 뺀 값

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 > ");
		String str = sc.next();

		String result = "문자열에 있는 문자 : " + str.charAt(0) + " ";
		int count = str.length();
		
		// i부터 문자열의 길이까지
		for(int i = 1; i <= str.length()-1;i++) {
			// 반복문으로 charA(i)번빼 인덱스와 charAt(j)번째 인덱스까지 비교
			for(int j = 0; j<=i-1; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					// 똑같네? 뺴자
					count--;
					break; // j포문에서 나감
				}// 중복되지 않은 값을 넣어야하는데, 
				else if(str.charAt(i) != str.charAt(j) && (j==i-1)){
				result += str.charAt(i)+" ";
				}
			}
		}
		System.out.println(result);
		System.out.println("중복되지 않은 문자 개수 : " + count);
	}

}