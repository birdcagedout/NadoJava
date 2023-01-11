package chap01;

public class _05_VariableNaming {
	public static void main(String[] args) {
		// 변수 이름 짓기
		// 1. 밑줄, 문자, 숫자 가능, 공백 불가
		// 2. 밑줄 또는 문자로만 시작 가능
		// 3. 단어의 연속 사용
		// 4. 소문자로 시작 + 다음 단어의 첫글자는 대문자(camel case)
		// 5. 예약어 사용 불가(public, static, void, int, double, float ...)

		// 입국 신고서
		String nationality = "대한민국";
		String firstName = "현성";
		String lastName = "김";
		String dateOfBirth = "2001-12-31";
		String residentialAddress = "땡땡호텔";
		String purposeOfVisit = "관광";
		String _flightNo = "KE657";

		int accompany = 2;
		int lengthOfStay = 5;

		String item1 = "시계";
		String item2 = "가방";
		//String 3item = "휴대폰";

		// 상수는 대문자
		final String CODE = "KR";

	}
}
