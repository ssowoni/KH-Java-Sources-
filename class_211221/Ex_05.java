//여러 클래스의 객체를 생성해서 값을 받아온다.
package class_211221;
public class Ex_05 {

	public static void main(String[] args) {
		//회원정보 클래스, 필드 변수만 있을 뿐, 특별한 것 없음
		Ex_05Member member = new Ex_05Member();
		member.regMember();
		member.modMember();
		
		//차량 정보 클래스, 역시 변수 이외에 구현된 것 없음
		Ex_05Car car = new Ex_05Car();
		car.checkCarInfo();
		car.midCarInfo();
		
		//예약 메소드, 변수 외에 구현된 것 없다. 
		Ex_05Reservation reserve = new Ex_05Reservation();
		reserve.reserveCar();
		reserve.modReserveInfo();
		reserve.cancleReserveInfo();
		

	}
}
