//문제 월의 이름을 입력하시오? 1, 2, 3은 출력되고 나머지 월은 0으로 출력되게 만들어보자
package class_211209;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요(1~12):");
		int month = sc.nextInt();
			
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3 :
			System.out.println("March");
			break;
		default :
			System.out.println("0");
			break;
		}
		
		sc.close();
		

	}

}
