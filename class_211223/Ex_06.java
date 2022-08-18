package class_211223;
//무명클래스

interface RemoteControl{
	
	void turnOn(); 
	void turnOff(); 

}

public class Ex_06 {

	public static void main(String[] args) {
		//이렇게 객체 변수를 사용한 후 중괄호 안에 메소드를 재정의 해서 활용
		//보통 추상클래스나 인터페이스의 구현은
		//해당 클래스를 상속 받은 후 클래스 자체에서 구현하는 식이다.
		RemoteControl ae = new RemoteControl(){
			
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};
		//implement로 인터페이스를 클래스에 역할 부여 하는 대신 무명 클래스를 이용했다.
		//한번만 사용할 때 쓰는 방법이다. 
		ae.turnOn();
		ae.turnOff();
	}

}
