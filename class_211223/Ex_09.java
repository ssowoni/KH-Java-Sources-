package class_211223;


import class_211223_1.Myfunction;

public abstract class Ex_09 implements Myfunction {
	//public class Ex_09{
	public static void main(String[] args) {
		
		//람다식, 메소드를 편하게 활용하기 위해 추가된 기능
		//람다식을 활용하면 코드를 많이 줄일 수 있지만 자바에서는 별로 사용하지 않는다.
		//인터페이스 객체 = 변수명 -> 메소드 정의
		
		Myfunction square = x -> x*x;
		//square.clac(2)를 하면 인터페이스 메소드가 윗줄의 식으로 구현되어 결과가 출력된다.
		System.out.println(square.calc(2));

	}
}
