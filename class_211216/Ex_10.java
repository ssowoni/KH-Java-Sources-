package class_211216;

public class Ex_10 {
	//예제 9번과 다르게 static 선언을 안 해준 이유는 아래에 객체 변수를 생성해줬기 때문이다.
	
	public void print() {
		System.out.println(" 메소드를 호출합니다. ");
		//void 타입이기에 리턴이 없다.
	}
	


	public static void main(String[] args) {
		int a = 1;
		int b =2;
		int result = 0;
		
		//해당 예제 클래스의 객체 변수 m을 생성함
		//Ex_10()은 기본 생성자로 클래스 내에 생성자를 만들지 않아도 자동으로 생성됨. 
		//생성자의 이름은 클래스 이름과 동일해야 한다.! 
		Ex_10 m = new Ex_10();
		
		m.print(); // m 객체 변수를 생성하고 그 내부 print() 메소드 활용 가능
		m.print(); // 객체 변수 생성 안 하고 활용하려면 static 메소드로 변강하면 가능하다.
		m.print();


	}

}
