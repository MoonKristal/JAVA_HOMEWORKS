package com.home.no_2;

import java.util.Scanner;

public class Practice2 {
	
//	1. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//	아니면 false를 출력하세요.
//	(단, num1은 num2보다 작아야 함)
	
//	ex.
//	정수1 : 4
//	정수2 : 11
//	입력 : 13
	
//	true
	
	public void method1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("정수3 입력 : ");
		int num3 = sc.nextInt();
		
		if(!(num1<num2)) {
			System.out.println("정수1은 정수2보다 작은 수이여야 합니다.");
		}else if(num1>=num3 || num3 > num2){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
		

//	2. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	
//	ex.
//	입력1 : 5
//	입력2 : -8
//	입력3 : 5
	
//	false
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("정수3 입력 : ");
		int num3 = sc.nextInt();
		
		if(!(num1==num2 && num2==num3)) {
			System.out.println("false");
		}else{
			System.out.println("true");
		}
		
//		String flag = (num1 == num2)? ((num2 == num3)? "true" : "false") : "false";
	}
	
//	3. 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//	짝수가 아니면 “홀수다“를 출력하세요.
//	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	
//	ex.
//	숫자를 한 개 입력하세요 : -8
//	양수만 입력해주세요.
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 입력 : ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("양수만 입력해주세요.");
		}else if(num%2==0) {
			System.out.println("짝수다.");
		}else{
			System.out.println("홀수다.");
		}
		
		String flag = (num<0)? "양수만 입력해주세요." : (num%2 ==0)? "짝수다" : "홀수다";
		System.out.println(flag);
		
	}

//	4. 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력(double)하세요.
//	(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//	“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	
//	ex.
//	피연산자1 입력 : 15
//	피연산자2 입력 : 4
//	연산자를 입력(+,-,*,/,%) : /
//	15 / 4 = 3.75000

	public void method4() {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수1 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("정수2 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.println("연산기호 입력 : ");
//		String str = sc.next();
		
//		double result = 0.0;
		
//		if(num1<0 || num2<0 || (str=="+" || str=="-"|| str=="*"|| str=="/"|| str=="%")) {
//			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
//		}else {
//			System.out.printf("%d %s %d = %f",num1,str,num2,result);
//		}
		// System.out.printf("%d %s %d = %f",num1,str,num2,result);
		// result값에 넣어야 할 것 같아서 이렇게 만들었는데
		// 이것 저것 건들여봐도 result값을 어떻게 얻어야 하는지 모르겠습니다..ㅠㅠ
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int n2 = sc.nextInt();
		System.out.println("연산기호 입력 : ");
		char op;
		op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		if((n1<0 || n2<0)||(op!='+'&& op!='-'&& op!='*'&& op!='/'&& op!='%')){
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}else {
			if(op == '+')result = n1+n2;
			else if (op =='-')result = n1-n2;
			else if (op =='*')result = n1*n2;
			else if (op =='/')result = n1/n2;
			else if (op =='%')result = n1%n2;
			System.out.printf("%d %c %d = %.1f",n1, op, n2, result);
		}
	}
}
