package class_211222;

public class Ex_01Clac {
	//클래스내 메소드가 모두 static 멤버이므로 객체 생성 없이도 바로 사용 가능하다.
	//abs메소드는 삼항 연산자를 활용해 a가 0보다 크면 + 0보다 작으면 -a로 만들어 절대값을 만든다. 
	
	//절대값
	public static int abs(int a) {
		return a> 0 ? a : -a;
	}
	
	//max나 min 메소드도 삼항 연산자를 활용한다.
	public static int max (int a, int b) {
		return (a > b) ? a:b;
	}
	
	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
	

}
