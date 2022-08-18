package class_211223;

interface MyFunction3{
	int calc(int x, int y);
}

public class Ex_14 {

	public static void main(String[] args) {
		//인터페이스 메소드 안에 3, 4 인수를 입력하고, 동작을 구현한 것
		//static 메소드 이므로 별도의 객체 생성 없이 사용 가능하다.
		printMultiply(3,4,(x, y) -> x * y);
		
	}
	//인터페이스 객체 변수는 매개변수MyFunction3 f이 부분으로 생성
	//MyFunction3 f= (x,y) -> x * y; 이런 뜻이 된다
	static void printMultiply(int x, int y, MyFunction3 f) {
		//f를 람다식 전달받음
		System.out.println(f.calc(x, y));
	}

}
