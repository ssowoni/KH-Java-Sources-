//setter 대신에 생성자를 쓸 수 있다. 
package class_211221;
public class Ex_04CarDesign {
	
	
	
	private String carName;
	private String carColor;
	private int velocity;
	private int carSize;
	
	//생성자는 객체 생성시 전달받은 값을 객체로 초기화하기 위해서 생성자를 사용한다. 
	//객체 생성할 때 4개의 인자를 받았기 때문에 4개의 매개변수를 적어준다.  
	public Ex_04CarDesign(String carName, String carColor, int carSize, int velocity) {
		this.carName = carName;
		this.carColor = carColor;
		this.carSize = carSize;
		this.velocity = velocity;
	}
	
	public String getCarName() {
		return carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public int getCarSize() {
		return carSize;
	}
	public int getVelocity() {
		return velocity;
	}
	public void speedUp() {
		++velocity;
	}
	public void speedDown() {
		--velocity;
		if(velocity<0)
			velocity=0;
	}
	public void stop() {
		velocity=0;
	}


}
