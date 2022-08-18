package class_211220;

public class Ex_04car {
	String color;
	//color 객체에 저장된 값은 없으므로 출력값도 없다
	//String은 초기값 없을 경우 null로 
	int speed;
	int gear;
	//Override : 이미 존재하는 메소드의 기능을 변경하는 것 (다형성)
	@Override
	//toString 메소드를 실행시켜 System.out.print 메소드에 문자열 전송
	//toString은 특수 메소드이다.
	
	public String toString() {
		return "Car [ color=" + color + ", speed= " +speed+ ", gear=" +gear + "]";
	}
	//ex10 클래스에서 전달받은 1이 객체 변수에 저장된다.
	void chageGear( int g) {
		gear = g;
	}
	
	//객체에서 speedUp 메소드를 실행시켜 스피드에 10이 추가된다.
	void speedUp() {
		//speed의 값은 int 형으로 기본값은 0이다.
		speed = speed + 10;
	}
	//speedDown 메소드가 실행되면 속도가 10 감소
	void speedDown() {
		speed = speed - 10;
	}
	
}
