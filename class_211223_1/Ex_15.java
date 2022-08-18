package class_211223_1;

@FunctionalInterface
interface MyFuntion3{//함수형 인터페이스
	int calc(int x, int y);//람다식으로 구현할 추상메소드
	//void print();
}
public class Ex_15 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x, y) -> x*y);
		//람다식 ((x,y)) -> x*y)을 매개변수로 전달

	}
	private static void printMultiply(int x, int y, MyFuntion3 f) {
		//f로 (x,y)->x*y 람다식 전달 받음
		System.out.println(f.calc(x, y));
	}

}
//@FunctionalInterface 의 사용은 컴파일러에게 인터페이스가 추상 메소드가 1개만 있는 함수형
//인터페이스인지 확인하도록 하여, 처음부터 잘못된 인터페이스 작성을 막는 장점이 있다. 
