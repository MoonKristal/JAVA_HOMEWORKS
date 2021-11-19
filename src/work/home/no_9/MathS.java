package work.home.no_9;

import java.util.Scanner;

public class MathS {
	public int num1;
	public int num2;
	public char ch;
	public int result;
	public int count1 = 0;
	public int count2 = 0;
	public int i;
	public int j = 1;
	public Scanner sc = new Scanner(System.in);

	public void numbers(int num1, int num2, int i) {

		if (i % 2 == 0) {
			ch = '+';
			System.out.printf("Q%d) %d %s %d = ? \n", j++, num1, ch, num2);
			System.out.println(">> ");
			result = sc.nextInt();
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("# 정답횟수 : " + count1 + "회, 오답횟수 : " + count2 + "회");
				System.exit(0);
			} else if (result == (num1 + num2)) {
				System.out.println("# 정답입니다.");
				count1++;
			} else {
				System.out.println("# 오답입니다.");
				count2++;
			}
		} else if (i % 3 == 0) {
			ch = '-';
			System.out.printf("Q%d) %d %s %d = ? \n", j++, num1, ch, num2);
			System.out.println(">> ");
			result = sc.nextInt();
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("# 정답횟수 : " + count1 + "회, 오답횟수 : " + count2 + "회");
				System.exit(0);
			} else if (result == (num1 + num2)) {
				System.out.println("# 정답입니다.");
				count1++;
			} else {
				System.out.println("# 오답입니다.");
				count2++;
			}
		} else if (i % 3 == 0) {
			ch = '-';
			System.out.printf("Q%d) %d %s %d = ? \n", j++, num1, ch, num2);
			System.out.println(">> ");
			result = sc.nextInt();
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("# 정답횟수 : " + count1 + "회, 오답횟수 : " + count2 + "회");
				System.exit(0);
			} else if (result == (num1 - num2)) {
				System.out.println("# 정답입니다.");
				count1++;
			} else {
				System.out.println("# 오답입니다.");
				count2++;
			}
		} else if (i % 5 == 0) {
			ch = '*';
			System.out.printf("Q%d) %d %s %d = ? \n", j++, num1, ch, num2);
			System.out.println(">> ");
			result = sc.nextInt();
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("# 정답횟수 : " + count1 + "회, 오답횟수 : " + count2 + "회");
				System.exit(0);
			} else if (result == (num1 * num2)) {
				System.out.println("# 정답입니다.");
				count1++;
			} else {
				System.out.println("# 오답입니다.");
				count2++;
			}
		} else {
			ch = '/';
			System.out.printf("Q%d) %d %s %d = ? \n", j++, num1, ch, num2);
			System.out.println(">> ");
			result = sc.nextInt();
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("# 정답횟수 : " + count1 + "회, 오답횟수 : " + count2 + "회");
				System.exit(0);
			} else if (result == (num1 / num2)) {
				System.out.println("# 정답입니다.");
				count1++;
			} else {
				System.out.println("# 오답입니다.");
				count2++;
			}
		}
	}
}

