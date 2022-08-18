package class_211213;

import java.util.Scanner;

public class Ex_06_Task {

	public static void main(String[] args) {
		
		double grade; // 평점
		int score; //토익점수
		//토익 점수를 저장하는 변수를 선언한다. 
		//토익 점수를 입력받는다.
		//토익 점수는 700이상 평점은 4.0 넘으면 면접 대상자 
		//평점이 3.5이상이면 서류전형 대상자
		//평점이 3.0이상이면 필기시험 대상자
		//나머지는 지원할 수 없다. 
				
		
		Scanner sc = new Scanner(System.in);
		System.out.print("평점을 입력하세요: ");
		grade = sc.nextDouble();//grade에 평점을 입력받는다
		System.out.print("토익점수를 입력하세요: ");
		score = sc.nextInt();//score에 토익점수를 입력받는다.
		
		if (grade>=4.0 && score >=700)
		{//만약에 grade가 4.0이상이고 score가 700 이상이면 아래 문장 실행
			System.out.println("면접 대상자입니다");
		}
		else if(grade >= 3.5)
		{//위에 해당되지 않고 grade가 3.5이상이면 아래 문장 실행
			System.out.println("서류전형 대상자입니다");
		}
		else if(grade >= 3.0)
		{//위에 해당되지 않고 grade가 3.0이상이면 아래 문장 실행
			System.out.println("필기시험 대상자입니다");
		}
		else 
			//모두 포함되지 않으면 아래문장 실행
			System.out.println("지원할 수 없습니다.");
			
		
		sc.close();
		
	}
	
}
