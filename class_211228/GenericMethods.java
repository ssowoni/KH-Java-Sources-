package class_211228;

public class GenericMethods {
	
	//접근제어자 <제네릭 타입 파라미터> 리턴 타입 메소드명 ( 매개변수) 
	//반환(리턴) 타입과 매개변수의 타입이 같아야한다.
	//T method1 (T t), String method1 (String t)
	public <T> T method1 (T t) {
		return t;
	}
	//접근제어자 <제네릭 타입 파라미터> 리턴 타입 메소드명 ( 매개변수) 
	//리턴 타입을 boolean으로 지정했기에 true, false값이 나온다. 
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public<K,V> void method3(K k, V v) {
		System.out.print(k + " : ");
		System.out.println(v);
	}
}

//제네릭 타입변수명 한 개인 경우
//접근 지정자 <T> T메서드 이름 (T t){
//타입 T를 사용한 코드
//}