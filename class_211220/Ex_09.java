//코드를 좀 더 간단하게 하려면 로직(반복문, 조건문)보다는 메소드를 이용하자 
package class_211220;

public class Ex_09 {

	public static void main(String[] args) {
		
		String str = "  한글  ABCD  efgh  ";
		
		System.out.println("원 문자열 ==>[" + str + "]");
		
		//↓toUpperCase() : 문자열 변수를 모두 대문자로 변경
		System.out.println("대문자로 ==>[" + str.toUpperCase() + "]");
		
		//↓toLowerCase() : 문자열 변수를 모두 소문자로 변경
		System.out.println("소문자로 ==>[" + str.toLowerCase() + "]");
		
		//★↓trim() : 문자열 양 끝단의 공백문자를 제거★
		System.out.println("좌우공백제거 ==>[" + str.trim() + "]");
		
		//↓replaceAll("A", "B") : 좌변의 문자 A를 B로 교체한다.
		System.out.println("공백제거 ==>[" + str.replaceAll(" ", "") + "]");

	}

}
