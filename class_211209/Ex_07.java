package class_211209;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//scanner의 객체 이름은 원하는대로!
		System.out.println("수를 입력하시오:");
		int number = in.nextInt();
		
		if(number % 3 == 0)// =, ==의 차이점 알기
			//= 은 값을 대입하는 연산자 ex) x = 3;
			//==은 좌측항과 우측항이 같다는 연산자 x == y는 둘이 같다는 의미
			System.out.println("3의 배수입니다.");
			//number를 3으로 나눴을 때 나머지가 0이면 3의 배수
		else
			System.out.println("3의 배수가 아닙니다.");
		
		in.close();
	
	}

}
