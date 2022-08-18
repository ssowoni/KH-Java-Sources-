package class_211213;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		final int STUDENTS = 5; //고정값이므로 상수로 선언, 배열의 갯수로 사용
		int total = 0; // 초기화
		int [] aa = new int[STUDENTS]; //5개의 방을 가진 배열 aa생성
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<aa.length; i++) { //for문안에 조건식 넣기
			System.out.print("성적을 입력하시오: ");
			aa[i] = sc.nextInt(); //배열 aa에 입력 값 하나씩 저장하기
			total += aa[i]; // total = total + aa[i] 
			//원래 있던 total값에 새롭게 입력받은 aa[i]값을 더해주는 것!
			
		}
		System.out.println("합계: " + total);
		
		total /= STUDENTS; //합계를 STUDENT(5명)으로 나누면 평균
		System.out.print("평균: " + total);
		
		sc.close();
			
	}

}
