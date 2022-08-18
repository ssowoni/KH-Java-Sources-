package class_211210;

public class Ex_06 {

	public static void main(String[] args) throws Exception {
		String str1 = "abc";
		String str2 = str1;
		String str3 = new String("abc");
		
		// == 연산자는 주소를 비교합니다.
		
		System.out.println(str1 == str2);//true
		//str2에 str1에 값을 넣었으므로 주소를 같이 공유합니다.
		
		System.out.println(str1 == str3);//false
		//str1과 str3는 각각 생성되었으므로 주소가 다릅니다.
		
		//equals()는 내용을 비교합니다.
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3));//true
		//내용을 비교하기 때문에 abc내용이 같으므로 true가 반환됩니다.

	}

}

/* 1. str1 == str2
 * true. str2를 str1에 넣었기 때문에 같은 주소를 사용하고 있어서 true 결과가 나왔다.
 * 
 * 2. str1 == str3
 * flase. str은 새로운 new String으로 새로운 주소를 부여해서 주소비교로 인해 false 결과가 나왔다.
 * ★ str1과 str3은 다른 객체이기 때문이다
 * 
 * 3. str.equals(str2)
 * true. 내용 비교이므로 abc 내용이 같아서 같은 값이 나왔다.
 * 
 * 4. str1.equals(str3)
 * true. 내용 비교이므로 abc내용이 같아서 true라는 결과가 나왔습니다.
 * 문자열을 비교할 때는 == 보다는 equals를 사용한다
 */
