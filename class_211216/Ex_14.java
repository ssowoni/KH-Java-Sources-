//화살표 그어서 결과값이 왜 나왔는지 정리하기 
package class_211216;

public class Ex_14 {

	//↓반환형이 없는 print 메소드에 입렵값이 int형인 매개변수 a와 b를 받았다.
	public void print(int a, int b) {
		int c = a+ b;
		System.out.println("결과값= " + c);
	}
	
	//↓반환형이 없는 print1 메소드에 입력값이 String 형인 매개변수 str을 받았다.
	public void print1(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		//num1, num2, result에 값 대입해준다. 
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		//Ex_14클래스의 객체 변수 생성 
		//Ex_14()은 기본 생성자로 클래스 내에 생성자를 만들지 않아도 자동으로 생성됨. 
		Ex_14 m = new Ex_14();
		//메소드 활용 
		
		m.print(10, 30); //결과값= c, c= int a + int b의 값이므로 10 +30 = 40 
		m.print(num1, num2); //결과값 c, c= num1 + num2의 값이므로 11 + 22 = 33 
		//print1 메소드 활용
		m.print1("안녕하세요");// "안녕하세요"를 print1 메소드의 str 매개변수에 대입해준다. 

	}
	
}
