package class_211222;

public class Ex_08 {

	public static void main(String[] args) {
		Ex_08ColorPoint cp;
		//자식 클래스의 생성자 호출(1)
		cp = new Ex_08ColorPoint(5, 6, "blue");
		//Ex_08ColorPoint 메소드 동작이 완료되면 showColorPoint 메소드 호출 (7)
		cp.showColorPoint();

	}

}
