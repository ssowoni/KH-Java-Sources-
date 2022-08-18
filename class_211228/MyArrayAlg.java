package class_211228;

public class MyArrayAlg {
	
	//제너릭 메소드 
	//static 메소드이므로 별도의 객체 생성 없이 바로 활용 가능
	//전달 받은 타입과 같은 줄에 있는 T도 꺽쇠 안에 있는 T로 통일 가능하다. 
	public static <T> T getLast(T[] a) {
		//가장 마지막 배열 요소를 출력
		//length 메소드 : 배열에 저장된 요소 수를 출력
		return a[a.length-1]; //JAVA출력 
	}
}

//객체 생성시 제너릭타입을 지정하지 않으면 올 수 있는 Type 중 최상위 클래스 (Object)로 인식
//(즉, 아래 두 코드는 동일한 의미이다)
//MyClass mc = new Myclass();
//Myclass <Object> mc = new MyClass<>();

//클래스명<실제제네릭타입> 참조변수명 = new 클래스명 