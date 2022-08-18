//에러잡기
package class_211209;

import java.util.Scanner;

public class Ex_06 {//클래스 영역

	public static void main(String[] args) {//메소드 영역
		
		Scanner scanner = new Scanner(System.in);//스캐너 객체 생성
		System.out.println("첫 번째 정수를 입력하세요:");
		int number1 = scanner.nextInt();//number 값을 입력받는다.
		System.out.println("두 번째 정수를 입력하세요:");
		int number2 = scanner.nextInt();
		
		int sum = number1 + number2;
		// number하면 숫자가 생각나니까 누가봐도 숫자, 이름 짓는데 신중하자
		System.out.println("합= " + sum);
		int diff = number1 - number2;
		System.out.println("차= " + diff);
		int product = number1 * number2;
		System.out.println("곱= " + product);
		
		scanner.close();
	}

}
