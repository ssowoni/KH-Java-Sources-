package class_211209;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100):");
		int score = sc.nextInt();
		/*if(score>100)
			System.out.println("0~100사이로 입력해주세요");
		int score1 = sc.nextInt();
		*/
		System.out.println("학년을 입력하세요(1~4)");
		int year = sc.nextInt();
		
		//문제> 60점 이상이면서 1,2,3학년이면 합격이고 아니면 불합격, 해당 없어도 불합격
		//if문 사용하는데 단순하게 라인을 줄여주자
		
		if(score>=60 && year<=3)
			System.out.println("합격입니다");
		else 
			System.out.println("불합격입니다");
		
		sc.close();
			

	}

}
