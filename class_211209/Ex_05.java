package class_211209;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = scanner.nextInt();
		
		if(score >= 80) {
			System.out.println("축하합니다 합격입니다");
		}
		else {
			System.out.println("다음기회에 불합격입니다");
		}
		/* if문을 condition문으로 간단하게 나타낼 수 있다고 해서 어떻게 할까 고민해봤다.
		String a = "합격입니다";
		String b = "다음기회에";
		System.out.println((score>=80)?a:b);
		*/
				
		
		scanner.close();

	}

}
