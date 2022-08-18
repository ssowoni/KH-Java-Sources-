package class_211210;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.printf("목표액 입력: ");
		//int aim = scanner.nextInt();
		
		final int aim = 1000; //바뀌지 않을 값이기에 final
		System.out.printf("목표액 : %d\n", aim);
		System.out.println("실적 입력: ");
		int result = sc.nextInt();//result 입력값을 받는다.
		int bonus;//정수형 bonus 선언
		
		if(result >= aim) {//만약에 실적이 aim 값보다 크면 밑에 문장 실행
				bonus = (result - aim)/10; 
				// 보너스 값을 10으로 나눠서 출력
				System.out.printf("보너스 : %d", bonus);
			}else // 실적이 aim보다 작으면 아래 문장 실행
				System.out.println("달성 실패!");
			sc.close();
		

	}

}
