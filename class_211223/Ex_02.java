package class_211223;
//인터페이스 (interface) 매우 중요
//추상 클래스의 변형, 인터페이스는 추상클래스와 유사하지만 클래스가 아니다.
//클래스처럼 상속을 해주지만 클래스가 아니므로 다수의 인터페이스의 상속을 받는것도 가능하다.
//인터페이스는 interface I_NAME 이런 식으로 선언하며
//인터페이스에서 상속은 class C_NAME implements I_NAME 이런 식으로 쓰인다.
//추상클래스는 설계와 구현을 분리시키기 위해서
	
interface PhoneInterface{
		//인터페이스에서 선언되는 필드 변수는 모두 상수 변수 (final)이다.
		//아니어도 되지만 대부분 그렇게 사용한다.
		final int TIMEOUT = 10000;
		void sendCall();
		void receiveCall();
		
		//default 메소드 : 인터페이스의 메소드 중 하나는 일반 클래스의 메소드처럼 동작이 정의될 수 있다.
		//default 메소드를 활용하면 자바에서도 다중상속을 할 수 있다.
		default void printLogo() { //default 메소드
			//interface 내부에 메소드, 맞기만 하면 가져다 쓸수 있는 것이다.
			System.out.println("**Phone**");
		}
	}
//인터페이스 구현은 implements 키워드 활용
//인터페이스는 두개의 오버라이딩을 받을 수 있는것인가? 그럼? 이게 아니라 다중으로 인터페이스 다중 상속을 받을 수 있는것!! Ex_03번 살펴보자! 
class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화에 불이 켜졌습니다.");
		
	}
	
}
public class Ex_02 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		
	}

}
