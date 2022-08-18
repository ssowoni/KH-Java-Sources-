//앞 예제에서 나온 에러를 잡기 위한 try catch문
package class_211217;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//나눠지는 수와 나누는 수 모두 int형으로 선언된다
		int dividend;
		int divisor;
		
		//scanner 객체를 활용해 데이터 입력
		//(복습) nextInt() : int형 변수 입력 받는다.
		System.out.print("나뉨수를 입력하시오 : ");
		dividend = sc.nextInt();
		System.out.print("나눗수를 입력하시오 : ");
		divisor = sc.nextInt();
		
		//try - catch문
		//try 내부 코드에 에러가 없으면 try 내부 코드가 실행되지만 오류가 있을 경우 try는 실행되지 않으며
		//catch문 내부 exception(예외 유형)과 일치하면 catch문 내부 코드가 진행된다.
		//즉 에러가 발생하지 않고 에러 유형을 다른 사용자로 부터 감출 수 있다. 
		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은" + dividend /divisor + "입니다");
			
		}
		
		catch (ArithmeticException e) {
			//ArithmeticException 예외 코드
			System.out.println(" 0으로 나눌 수 없습니다! 다시 입력하세요.");
			
		}
		
		sc.close();
	}

}
