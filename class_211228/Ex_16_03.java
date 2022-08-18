//재내릭 메소드
package class_211228;

public class Ex_16_03 {

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		//메소드 이름 앞에 <제네릭 파라미터>가 있으면 제네릭 메소드
		//리턴타입 변수명 = 클래스.<구체적 타입> 메소드명(인자)
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");
		System.out.println(str1 + "," +str2); //안녕, 안녕
		
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		System.out.println(bool1+ ", " + bool2);//true, true
		
		gm.<String, Integer>method3("국어", 80); //국어 :80
		//↓구체적인 타입(파라미터 타입)을 생략해도 똑같은 값이 나온다.
		gm.method3("국어", 80); //국어 : 80
		
		

	}

}
