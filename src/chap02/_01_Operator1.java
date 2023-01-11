package chap02;

public class _01_Operator1 {
	public static void main(String[] args) {
		// 산술연산자
		System.out.println(4 / 2);		// 2
		System.out.println(2 / 4);		// 0
		System.out.println(5 / 2);		// 2
		System.out.println(4 % 2);		// 0

		System.out.println(2 > 3);
		System.out.println(2 > 3 || 3 > 1);		// 비교 > 논리

		// 변수 연산
		int a = 20;
		int b = 10;
		int c;

		// 증감연산
		int val;
		val = 10;
		System.out.println(val++);
		System.out.println(++val);
	}
}
