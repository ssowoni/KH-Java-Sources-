package class_211216;
//동일 패키지 내에 제작된 클래스 import가 필요 없다
//만약 동일 패키지가 아니라면 import를 통해 해당 패키지의 클래스를 import 해줘야 한다.
public class Ex_13 {

	
	public void plus(int a) {
		System.out.println(" 결과값 = " + a);
	}
	public static void main(String[] args) {
		int a = 11;
		int b =22;
		int result = 0;
		
		Ex_10 m = new Ex_10();
		Ex_12 n = new Ex_12();
		// 이전 예제에서 생성된 클래스를 끌어다 쓴다. 
		
		result = a+ b;
		n.print(10);
		n.print(b);
		n.print(result);
		m.print();
		
		
		
		

	}

}
