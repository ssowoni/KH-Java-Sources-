package class_211208;

public class EX01_1208 {//클래스 생성

	public static void main(String[] args) {//메인 메서드
		String str1 = "IT CookBook 입니다.";//String은 값에 "" 써주기
		String str2 = "10"; //자료형이 문자열인 String str2생성
		String str3 = "20";
		int str4 = 10;//자료형이 정수형인 int str4생성
		int str5 = 20;

		str1 = "Java 입니다.";//str1라는 변수에 "Java 입니다"라는 값을 재설정 즉) 덮어쓰기
		
		System.out.printf("%s \n", str1);//printf는 포맷
		System.out.printf("%s \n", str2 + str3);
		//여기서 str2와 str3는 숫자가 아닌 문자열 String으로 정의되어 있어 30이 아닌 1020이라는 출력값이 나온다
		// %s = 문자열 한 글자 이상이고 큰따옴표" " 로묶여있어야한다 :"안녕, "abcdef", "a"  
		System.out.printf("%d", str4 + str5); //이렇게 int로 정의했을 때가 더하는 연산
	}

}
