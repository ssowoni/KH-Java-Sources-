package class_211228;
class StringUtil{
	private String value;
	//생성자에도 제너릭을 지정할 수 있으며 제너릭 클래스가 아니어도 가능
	//클래스나 인터페이스 모두 가능하다는 것. 
	//클래스or 인터페이스 상관 없이 항상 extends 사용, CharSequence 또는 그 하위로는 가능하다.
	//↓CharSequence : String과 다르게 인터페이스로 char 값을 읽을 수 있다.
	<T extends CharSequence>StringUtil(T value){//value가 중요
		//StringUtil su1 = new StringUtil(s);
		//T는 CharSequence를 상속받는 타입만 전달받을 수 있도록 선언하고 StringUtil에 T value값 저장
		this.value = value.toString();
		//value값을 호출시키는 함수를 value에 저장 
	}
	
	void printVal() {
		System.out.println("value: " + value);
		//printVal 함수 호출
	}
}


public class Ex_08_GenConsTest {//제너릭 생성자
	public static void main(String[] args) {
		String s = new String("서울");
		//String타입의 s는 서울이 저장된 String 객체 생성 
		StringBuffer sbuf = new StringBuffer("대전");
		//StringBuffer타입의 sbuf는 대전이 저장된 StringBuffer객체 생성
		//StringBuffer는 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전하다는 점(thread-safe)
		StringBuilder sbui = new StringBuilder("대구");
		// StringBuilder 타입의 sbui 대구가 저장된 StringBuilder객체 생성 
		//StringBuilder는 동기화를 지원하지 않기때문에 멀티쓰레드 환경에서 사용하는 것은 적합하지 않지만 
		//동기화를 고려하지 않는 만큼 단일쓰레드에서의 성능은 StringBuffer 보다 뛰어납니다.


		
		StringUtil su1 = new StringUtil(s);
		//su1은 s가 저장된 StringUtil 객체 생성
		StringUtil su2 = new StringUtil(sbuf);
		//su1은 s가 저장된 StringUtil 객체 생성
		StringUtil su3 = new StringUtil(sbui);
		//su1은 s가 저장된 StringUtil 객체 생성
		
		su1.printVal();
		//su1에 저장된 값 출력.
		su2.printVal();
		//su1에 저장된 값 출력
		su3.printVal();
		//su1에 저장된 값 출력
		
	}
	//접근 지정자 <T extends 최상위클래스명> T 메서드이름(T t){//타입제한 기본문법 구조
	//부모 클래스의 메서드 사용 가능
	//}
}
