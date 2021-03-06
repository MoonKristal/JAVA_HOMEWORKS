package work.home.no_1;
import java.util.Scanner;

public class VariablePractice1 {
	// 클래스명 : VariablePractice1
	// 메인메소드를 제외한 모든 메소드 이 클래스에 작성
	// 
	
	// 1번 문제
	// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	// ex. 
	// 첫 번째 정수 : 23
	// 두 번째 정수 : 7
	//
	// 더하기 결과 : 30
	// 빼기 결과 : 16
	// 곱하기 결과 : 161
	// 나누기 몫 결과 : 3
	public void question1() {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int i = a.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int j = a.nextInt();
		
		System.out.println("더하기 결과 : " + (i+j));
		System.out.println("빼기 결과 : " + (i-j));
		System.out.println("곱하기 결과 : " + (i*j));
		System.out.println("나누기 몫 결과 : " + (i/j));
	}
	
	// 2번 문제
	// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	// 계산공식 ) 면적 : 가로 * 세로
	//         둘레 : (가로 + 세로) * 2
	// ex.
	// 가로 : 13.5
	// 세로 : 41.7
	//
	// 면적 : 562.95
	// 둘레 : 110.4
	public void question2() {
		
		Scanner gs = new Scanner(System.in);
		
		System.out.print("설정하실 가로의 길이를 입력하세요 : ");
		double garo = gs.nextDouble();
		System.out.print("설정하실 세로의 길이를 입력하세요 : ");
		double sero = gs.nextDouble();
		
		System.out.println("설정하신 값에 의한 면적 : " + (garo*sero));
		System.out.println("설정하신 값에 의한 둘레길이 : " + ((garo+sero)*2));
	}
	
	// 3번 문제
	// 영어 알파벳 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	//
	// ex. 
	// 문자열을 입력하세요 : apple
	//
	// 첫 번째 문자 : a
	// 두 번째 문자 : p
	// 세 번쨰 문자 : p
	public void question3() {
		
		Scanner apb = new Scanner(System.in);
		
		System.out.print("'사과'가 영어로 무엇입니까? : ");
		String pear = apb.nextLine();
		
		System.out.println("첫 번째 문자 : " +pear.charAt(0)); 
		System.out.println("두 번째 문자 : " +pear.charAt(1)); 
		System.out.println("세 번째 문자 : " +pear.charAt(2)); 
	}
	
	// 4번 문제
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	//
	// ex.
	// 이름 : 이승철
	// 학년(숫자만) : 3
	// 반(숫자만) : 4
	// 번호(숫자만) : 15
	// 성적(소수점 아래 둘째자리까지) : 85.75
	
	//3학년 4반 15번 이승철 남학생의 성적은 85.75이다.
	public void question4() {
		
		Scanner v = new Scanner(System.in);
		
		System.out.print("이름이 무엇입니까? : ");
		String name = v.next();
		System.out.print("몇 학년입니까?(숫자만) : ");
		int grade = v.nextInt();
		System.out.print("몇 반입니까?(숫자만) : ");
		int ban = v.nextInt();
		System.out.print("몇 번입니까?(숫자만) : ");
		int num = v.nextInt();
		System.out.print("당신의 음악성적은 몇입니까?(소수점 아래 둘째자리까지) : ");
		double result = v.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.", grade, ban, num, name, result);
	}
}
