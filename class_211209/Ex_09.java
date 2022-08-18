package class_211209;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 (0~100): ");
		int score = sc.nextInt();
		
		score = score/10;
		//10으로 나누면 9, 8, 7 간단하게 나온다.
		switch (score) {//switch문 시작
		case 10://10으로 나눈값이 10이면 밑에 문장 출력
			grade = 'A';
			break;//출력하고 case문 빠져나온다.
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default: // 그 나머지 값은 default로 나타낸다.
			grade= 'F';
			break;
		}
		System.out.println("학점은:" + grade + "입니다.");
		sc.close();
		}

	}


