//import랑 export도 정리해서 제출하자 
//Call by Value
// 값에 의한 호출 참조에 의한 호출 더 공부해야겠다. 
//가지고 있는 값과 출력 값은 다르다 
package class_211217;

public class Ex_04 {
	
	static void func1 (int a) {
		//static 붙어있고 동일 클래스에서 선언됐다.
				a = a+1 ;
				System.out.printf("전달받은 a ==> %d\n", a);
	}

	public static void main(String[] args) {
		
		int a = 10;
		//이번에는 객체를 생성하지 않기 때문에 메소드에 static을 붙였다.
		//객체 생성 안 하고 그냥 메소드를 사용하면 이탤릭체로 변한다.
		//func1의 메소드로 넘어간다. 
		//객체를 생성하지 않았기 때문에 값은 전달 되지 않은 것.
		func1(a);
		//먼저 func1 메소드가 실행도
		System.out.printf("func1() 실행 후의 a ==> %d\n", a);
	}

}
