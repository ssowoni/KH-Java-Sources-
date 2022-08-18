//Ex_03번과 비교하자
package class_211221;
public class Ex_04 {

	public static void main(String[] args) {
		//생성자(생성자는 특수 메소드) 중 데이터 전체를 입력하는 생성자를 만들어 사용
		//객체에 바로 값을 입력하는 것은 생성자! 
		//setter와 생성자의 값 입력 방식이 다르니 잘 확인해보자
		Ex_04CarDesign yourCar = new Ex_04CarDesign("그랜저", "검은색", 2500, 60);
		
		//getter 메소드를 활용해 생성자로 입력된 데이터를 획득
		String carName = yourCar.getCarName();
		String carColor = yourCar.getCarColor();
		int carSize = yourCar.getCarSize();
		
		//speed 메소드를 활용해 차량 속도 증가
		yourCar.speedUp();
		yourCar.stop();
		yourCar.speedUp();
		int velocity = yourCar.getVelocity();
		
		System.out.println("내 차 정보 출력: ");
		System.out.println("차 이름: " + carName + ", 색상: " + carColor + ",배기량: " +carSize + "cc" + ", 현재 속도: " + velocity +"입니다.");

		

	}

}
