//상속
package class_211222;

public class Ex_03 {
	//상속성, 아주 중요하다
	public static void main(String[] args) {
		//객체생성
		//Ex_03Point는 부모 클래스.
		Ex_03Point p = new Ex_03Point();
		//set 메소드를 활용해 데이터 입력
		p.set(1, 2);
		//입력된 데이터를 출력
		p.showPoint();
		
		//ColorPoint 객체 생성
		//이 객체는 Point 클래스의 자식이므로
		//메소드나 변수를 그대로 활용할 수 있음
		//부모 클래스에서 선언되어 있으면 굳이 자식 클래스에서 선언할 필요가 없다 (상속성)
		Ex_03ColorPoint cp = new Ex_03ColorPoint();
		//Ex_03ColorPoint클래스에는 SET 메소드가 없지만
		//부모 클래스인 Ex_03Point에 있으므로 상속받아 사용이 가능하다.
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		
	}

}
