package chap01;

import java.sql.SQLOutput;

public class _06_Constants {
	public static void main(String[] args) {
		final String KR_COUNTRY_CODE = "+82";
		//KR_COUNTRY_CODE = "+8282";			// cannot assign a value to final variable KR_COUNTRY_CODE
		System.out.println(KR_COUNTRY_CODE);

		final double PI = 3.141592;
		final String DATE_OF_BIRTH = "2001-12-31";		// 상수가 길면 밑줄 권장
	}
}
