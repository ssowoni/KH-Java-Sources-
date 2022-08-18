//Ex_03Car 클래스 보고 내가 작성한 것
package class_211221;

public class Ex_03CarDesign {
	//클래스내 필드 변수 선언
	String carName;
	String carColor;
	int carSize;
	int velocity;
	
	//★getter는 필드에 기록된 값을 읽어 요구하는 쪽으로 값을 넘긴다. 
	public String getCarName() {
		return carName;
	}
	//★setter는 carName에 저장할 값을 전달 받아서 필드 값을 변경한다.
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public int getCarSize() {
		return carSize;
	}
	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}
	
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public void speedUp() {
		
		++velocity;
		
	}
	public void speedDown() {
		--velocity;
		if(velocity < 0);
		velocity=0;
		
		
	}
}



