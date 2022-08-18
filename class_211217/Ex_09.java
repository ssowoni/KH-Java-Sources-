//에러! 변수 이름을 다르게 잘 못 입력했다. 
package class_211217;

public class Ex_09 {

	public static void main(String[] args) {
		//문자열을 정수로 반환할 때 발생하는 NumberFormatException을 처리하는 프로그램 작성
		
		String[] stringNumber = { "23", "12", "3.141592", "998"}; 
		
		int i =0;
		try {
			for ( i = 0; i < stringNumber.length; i++) {
				//Integer.parseInt은 문자열을 숫자로 변환시키는 방법으로
				//parseInt함수는 Integer의 static 함수이다. 
				//Integer.parseInt("2018" , 8)은 2018이라는 문자를 8진수의 정수형 숫자로 반환한다.
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
				
		} catch ( NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
		

	}


