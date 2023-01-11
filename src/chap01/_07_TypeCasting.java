package chap01;

public class _07_TypeCasting {
	public static void main(String[] args) {
		// Java의 (explicit) Type Casting:
		// - C-like casting만 OK					: (int)num;
		// - C++에서처럼 functional casting은 X	: int(num);

		// int --> float, double
		int score = 93;
		System.out.println(score);
		System.out.println((float)score);
		//System.out.println(float(score));		// 에러: '.class' expected
		System.out.println((double)score);

		 // float, double ==> int
		float score_f = 93.3f;
		double score_d = 98.8;
		System.out.println((int)score_f);
		System.out.println((int)score_d);

		// 정수 + 실수 연산
		//score = 93 + 93.8;			// 에러
		score = 93 + (int)93.8;
		System.out.println(score);		// 186

		score_d = 93 + 98.8;			// 93은 93.0으로 암시적 형변환
		System.out.println(score_d);

		// 변수에 형변환된 값 넣기
		double convertedScoreDouble = score;		// int --암시적형변환--> double
		System.out.println(convertedScoreDouble);	// 186.0
		
		// int -> long -> float -> double: 자동 형변환 된다.(소수점 있는 수는 double임에 주의)
		long l0 = 90;
		long l1 = 93 + 12_000_000_000l;

		float f0 = 93;
		float f1 = 93 + 12_000_000_000l;
		//float f2 = 90 + 0.5;						// 에러: 0.5는 double임: incompatible types: possible lossy conversion from double to float
		float f2 = 90 + (float)0.5;
		float f3 = 90 + 0.5f;

		double d0 = 1;
		double d1 = 1 + 100000000000l;
		double d2 = 1 + 0.5f;
		double d3 = 1 + 100000000000l + 0.5f + 3.14159;
		
		// double -> float -> long -> int: 수동 형변환 해야 된다.
		int i0 = (int)3.14;
		float f5 = (float)3.14;

		System.out.println("===========재미있는 실험1=============");
		long l00 = (long)Integer.MAX_VALUE + 1;
		long l01 = (long)(Integer.MAX_VALUE + 1);
		int i00 = (int)(Integer.MAX_VALUE + 1);
		System.out.println("long형 변수값 (long)Integer.MAX_VALUE + 1   : " + l00);
		System.out.println("long형 변수값 (long)(Integer.MAX_VALUE + 1) : " + l01);
		System.out.println("int형 변수값: " + i00);

		System.out.println("===========재미있는 실험2=============");
		System.out.println("Integer.MIN_VALUE     = " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE     =  " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE - 1 =  " + (Integer.MIN_VALUE - 1));
		System.out.println("Integer.MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));

		System.out.println("===========재미있는 실험3=============");
		System.out.println("Binary representation of Integer.MIN_VALUE : " + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("Binary representation of Integer.MAX_VALUE : " + "0" + Integer.toBinaryString(Integer.MAX_VALUE));


		// 숫자를 문자열로
		String s1 = String.valueOf(93);
		String s2 = Integer.toString(93);
		System.out.println(s1 + " " + s2);

		String s3 = String.valueOf(98.9);
		String s4 = Double.toString(98.9);
		System.out.println(s3 + " " + s4);


		// 문자열을 숫자로
		int i = Integer.parseInt("50");
		double d = Double.parseDouble("55.9");
		System.out.println(i);
		System.out.println(d);




	}
}
