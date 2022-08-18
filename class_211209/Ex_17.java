package class_211209;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변의 길이를 입력하세요:");
		a = sc.nextDouble();
		System.out.println("높이의 길이를 입력하세요: ");
		b = sc.nextDouble();
		
		//빗변의 길이를 구한다
		c = Math.sqrt(a * a + b * b);
		System.out.println("빗면의 길이는" + c + "이다."); 
		sc.close();
	}

}
