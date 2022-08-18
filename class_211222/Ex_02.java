package class_211222;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		//(복습) 입력을 담담하는 sc에 객체 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("활율(1달러) >>> ");
		
		//scanner 클래스를 통해 데이터를 입력할 때
		//부동소수점을 입력받고 싶으면 nextDouble() 메소드를 활용한다.
		double rate = sc.nextDouble();
		
		//static 클래스이므로 클래스명 그대로 활용 가능
		//만약 객체를 생성하려고 하면? Ex_02CurrencyConverter 객체명 = new Ex_02CurrencyConverter();
		//객체명.setRate(rate); 이런식으로 사용
		Ex_02CurrencyConverter.setRate(rate);

		//(복습) printf 내부 $ 0.2f만 사용해 소수점 두 자리 까지만 표현
		//%f를 포맷 스트링이라고 하며, (작은 따옴표) 뒤에 오는 변수(또는 상수)를 표현하는 역할을 한다.
		System.out.printf("백만원은 $%.2f 입니다. ", Ex_02CurrencyConverter.toDollar(1000000));
		System.out.printf("$100는 %.2f원 입니다. ", Ex_02CurrencyConverter.toKWR(100));
		
		sc.close();
				
	}

}










