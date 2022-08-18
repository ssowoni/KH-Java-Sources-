//Ex_03Car 클래스 보고 선생님이 주신 모범 답안
//반대로 Ex_03CarDesign2보고 Ex_03Car 를 직접 적어보자
package class_211221;

public class Ex_03CarDesign2 {
	
	//참조 객체의 변수들(필드)은 모두 private 접근 제어자를 가지므로 클래스 외부에서의 접근을 차단한다.
	//접근은 클래스 내부 getter & setter 메소드를 통해서만 간접적으로 가능함
	private String carName;
	private String carColor;
	private int carSize;
	private int velocity;
	
	//getter 메소드는 return값만 가진다.
	//필드에 저장된 값을 리턴함
	//★getter는 필드에 기록된 값을 읽어 요구하는 쪽으로 값을 넘긴다. 
	public String getCarName() {
		return carName;
	}
	//★setter는 carName에 저장할 값을 전달 받아서 필드 값을 변경한다.
	//Ex_03에서 전송받은 매개변수를 해당 클래스의 필드 변수에 저장
	public void setCarName(String _name) {
		carName = _name;
	}
	
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String _carColor) {
		carColor = _carColor;
	}
	
	public int getCarSize() {
		return carSize;
	}
	public void setCarSize(int _carSize) {
		carSize = _carSize;
	}
	
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int _velocity) {
		velocity = _velocity;
	}
	//speed메소드는 속도를 증가/감소 시키는 연산을 추가하여 차량의 속도 증가/감소 역할을 맡는다.
	public void speedUp() {
		velocity = velocity +1;
	}
	public void speedDown() {
		velocity = velocity -1;
		if(velocity < 0)
			velocity = 0;
	}
	public void stop() {
		velocity = 0;
	}
	public void park() {
		System.out.println("주차합니다.");
	}
}
