package class_211210;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		int answer = 59; 
		int guess;
		Scanner sc = new Scanner(System.in);
		//scanner로 입력 받기 
		int tries = 0; //tries 값을 0으로 초기화
		
		do {//do-while문이기에 문장 한 번은 무조건 실행
			System.out.println("정답을 추측하여 보시오 : ");
			guess = sc.nextInt();
			tries++; // tries = tries + 1
			
			if(guess > answer) //만약 추측한 값이 정답 59보다 높으면 아래 문장 실행
				System.out.println("제시한 점수가 높습니다.");
			if(guess < answer)//만약 추측한 값이 정답 59보다 낮으면 아래 문장 실행
				System.out.println("제시한 점수가 낮습니다.");
		}while ( guess != answer); //만약 답과 추측값이 맞지 않으면 do 반복문 처음으로 간다.
		// do- while문 끝에 ; 붙여주기
		//추측값과 정답이 같으면 반복문 탈출

		System.out.println("축하합니다. 시도횟수=" + tries);
		sc.close();
	}

}
