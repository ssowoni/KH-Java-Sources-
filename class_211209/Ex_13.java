package class_211209;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하시요 : ");
		int month = sc.nextInt();
		//콘솔창에서 입력 받을 값을 스케너 형태로 지정
		int days = 0;
		if(month == 2)
			days =28;
		else if (month < 8) {
			month = month % 2;
			//1월부터 7월까지는 홀수달이 31일
			switch (month) {
			case 1:
				days =31;
			//따라서 숫자를 2로 나눴을 때 1이 남으면 그 달은 31일
			//ex) 7월 31일까지 5월은 31일 까지
				break;
			case 0:
				days=30;
			//ex) 6월 30일까지 4월은 30일 까지
				break;
			}
		}
		else {//8월부터 12월을 의미한다
			month = month % 2;
			switch(month) {
			case 0:
				days = 31;
				//8월부터는 짝수달이 31일까지 있다
				break;
			case 1:
				days=30;
				break;
			}
			
		}
		System.out.println("이번 달:" + days + "일 입니다.");
		sc.close();
	}

}
