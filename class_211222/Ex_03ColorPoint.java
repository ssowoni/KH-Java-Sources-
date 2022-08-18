package class_211222;

public class Ex_03ColorPoint extends Ex_03Point {
//클래스 상속은 ? "자식클래스명 extends 부모클래스명" 이렇게 사용
//extends 끝에 s 붙여야 한다.
//상속 받은 클래스는 상속해준 클래스의 메소드 및 변수를 활용 가능하다
//상속받은 메소드의 경우 이름만 갖다 쓰고 내용은 변경할 수 있다. (오버라이딩, 다형성)
//자바는 하나의 클래스가 하나의 클래스만 상속 받을 수 있다 (다중상속 불가)
//상속은 해주는 것은 몇 번이고 가능하다.
//다중상속 문제를 해결하기 위해 인터페이스 (interface)가 존재하며
//인터페이스를 통한 간접 상속은 무한히 가능하다.
	
	private String color;
	//위의 color 변수 타입이 private 이므로
	//setter 메소드로 데이터 입력 받음
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		//super. 은 상속 받은 메소드를 활용하겠다는 표현이다.
		//super을 빼도 되지만 상속 받았다는 것을 표현하기 위해 쓴 것
		//이 메소드는 부모 클래스인 Ex_03Point.java에 존재하는 클래스
		//해당 객체에서 Ex_03Point.java에 직접 x, y 값을 대입하지는 않지만
		//x, y 역시 상속 받아 사용하므로 아예 x, y 변수를 선언 했다고 봐도 된다.
		super.showPoint();
	}
}
