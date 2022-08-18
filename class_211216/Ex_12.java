package class_211216;

public class Ex_12 {
	
	public void print(int a) {
		System.out.println("결과값 = " + a);
		// "결과값 =" 은 print 메소드의 매겨변수 int a의 값이다.
		
	}

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int result = 0;
		//객체를 생성하면 메모리에 인스턴스가 생성돼 메소드 활용 가능
		//클래스 이름과 같은 객체 변수 m을 생성한다.
		Ex_12 m = new Ex_12();
		result = a + b;
		
		//m.print(10)에서 10이 인수 (argument)
		m.print(10); // print(10) 을 입력해 줬기에 a값이 10으로 변경
		m.print(b); //print(b)를 입력해 줬기에 a 값이 b의 값으로 변경 
		m.print(result); //print(result)을 입력해 줬기에 a값이 result로 변경
		
		//다른 클래스의 객체 변서 n을 생성한다. 
		Ex_10 n = new Ex_10();
		n.print();

	}

}
