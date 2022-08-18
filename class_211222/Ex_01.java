package class_211222;

public class Ex_01 {

	public static void main(String[] args) {
		//static 메소드 이므로 객체 생성 없이 calc 클래스명을 그대로 사용할 수 있다.
		//이와 같은 static 클래스로는 Math가 있다. 
		
		//Ex_01Clac.abs()는 Ex_01Clac클래스에 abs 메소드에 인자 -5를 넣는다는 뜻!  
		System.out.println(Ex_01Clac.abs(-5));
		System.out.println(Ex_01Clac.max(10, 8));
		System.out.println(Ex_01Clac.min(-3, -8));

	}

}
