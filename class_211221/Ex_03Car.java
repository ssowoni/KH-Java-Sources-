package class_211221;

public class Ex_03Car {

	public static void main(String[] args) {
		
		//객체 생성
		Ex_03CarDesign2 myCar = new Ex_03CarDesign2();
		//setter 메소드를 활용해 객체 데이터 저장
		//setValueneme(input) 이렇 식으로 이름 짓는다.
		myCar.setCarName("소나타");
		myCar.setCarColor("은색");
		myCar.setCarSize(2000);
		myCar.setVelocity(60);
		
		//getter 메소드를 활용해 데이터 출력
		//getValuename() 이런 식으로 이름 짓는다.
		String carName = myCar.getCarName();
		String carColor = myCar.getCarColor();
		int carSize = myCar.getCarSize();
		int velocity = myCar.getVelocity(); 
		//SpeedUp 메소드를 활용하면 speed 속도가 향상된다.
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDown();
		
		//두번의 speedUp() 메소드를 실행해 증가된 속도를 출력한다.
		velocity = myCar.getVelocity();
		
		System.out.println("내 차 정보 출력: ");
		System.out.println("차 이름: " + carName + ", 색상: " + carColor + ",배기량: " +carSize + "cc" + ", 현재 속도: " + velocity +"입니다.");

	}

}
