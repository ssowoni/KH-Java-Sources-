//복습하는 겸이라 생각하고 문자열의 메소드 
package class_211220;

public class Ex_10 {

	public static void main(String[] args) {
		
		String str1 = "Java Programing";
		String str2 = "Java IT CookBook";
		
		System.out.println("원 문자열1 == > [" + str1 + "]");
		System.out.println("원 문자열2 == > [" + str2 + "]");
		
		//A.compareTo(B) : A와 B의 문자열 단어 중 차이가 나는첫 단어의 ASCII코드 수 차이 
		//ASCII 코드 : 숫자만 인식할 수 있는 컴퓨터에 문자를 활용하기 위한 표
		//컴퓨터에 문자 데이터로 숫자 데이터가 들어오면
		//ASCII 코드나 UNICODE 등 지정된 코드표에 숫자 데이터와 매칭되는 문자데이터로 변환
		//숫자만 아는 컴퓨터에 문자 데이터를 주고 받기 위해 만들어진 표, 영화 마션에 나왔다.
		
		System.out.println(str1.compareTo(str2));
		//아스키코드 기반 A B 같으면 0, A가 B보다 크면 양수반환, A가 B보다 작으면 음수 반환  
		System.out.println(str1.contains("Java"));

	}

}
