package class_211216;

public class Ex_15 {
	
	//해당 메소드에 어떤 매개변수를 사용하더라도 리턴 값은 일정하다 
	public double add(int a, int b) {
		int c = a + b;
		
		return c; 
		//c의 값을 반환한다. 
		//만약 return 3.5라고 지정하지 않았다면 30.0 과 400.0이 나온다. 
		//매개변수와 무관하게 리턴값은 무조건 정해져있다. 
		//return 3.5;
		//두 수의 합은 3.5가 나온 이유! 
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		double result = 0;
		//객체를 생성한다.
		Ex_15 m = new Ex_15();
		
		//add 메소드 결과를 result에 저장
		
		
		//System.out.println("두 수의 합은" + m.add(num1, num2));
		result = m.add(num1, num2);
		System.out.println("두 수의 합은 " +result );
		
		//저장 값이 아닌 메소드 값을 바로 출력
		System.out.println("두 수의 합은 " + m.add(100, 300));

	}

}
