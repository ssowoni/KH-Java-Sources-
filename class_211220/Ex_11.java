package class_211220;

public class Ex_11 {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		
		System.out.println("원 문자열1 ==> [" + str1 + "]");
		System.out.println("원 문자열1 ==> [" + str2 + "]");
		System.out.println("원 문자열3 ==> [" + str3 + "]");
		
		System.out.println("문자열1 == 문자열2 결과 : \t" + (str1 == str2));
		System.out.println("문자열1.equals(문자열2) 결과: " + str1.equals(str2));
		System.out.println("문자열1 === 문자열3 결과 : \t" + (str1 == str3));
		// == 주소값을 비교하는 연산자, equals는 값을 비교하는 연산자
		System.out.println("문자열1.equals(문자열3)결과" + str1.equals(str3));
		
		
		

	}

}
