
package class_211213;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		double entrytime; //들어온시간
		double exittime; //나간시간
		double ptime; //주차시간
		String flag; // y or n 반복 종료할 건지 여부 판단
		
		Scanner sc = new Scanner(System.in);
		do { //do 반복문은 일단 한 번 실행한다. 
			System.out.print("들어온 시간을 입력하세요:\t");
			entrytime = sc.nextDouble(); 
			System.out.print("나간 시간을 입력하세요: \t");
			exittime = sc.nextDouble();
			
			ptime = exittime - entrytime; 
			// 주차시간은 나간시간 - 들어온시간이다.
			double fee = 0.0; //요금을 0으로 초기값 설정
			if (ptime > 0.0) { //만약 주차시간이 0 이상이라면 아래 문장 실행
				if(ptime <= 1.0)
					//만약에 주차시간이 1.0 이하면 요금은 1,000원
					fee = 1000;
			else {//주차시간이 1.0 초과라면 
				fee = 1000 + Math.ceil(ptime - 1.0) * 500;
				//주차요금은 1000 + (ptime을 정수로 표현한 다음 -1.0) *500
				//ceil 함수는 인자값보다 크거나 같은 가장 작은 정수값을 double로 변환한다. 
				if ( fee > 10000) fee = 10000;
				//fee의 최대 값은 10,000원
			}
			}//여기서 괄호 오류 났다!!! 에러 코드 작성
			System.out.println("주차요금은 : \t " + fee);
			System.out.print("계속하기를 원하세요? 그렇다면 y를 아니면 n을 입력하세요 : \t");
			flag = sc.next();//참이다 아니다 이런 용도가 있을 때 flag을 사용한다. 
		}while( flag.equals("y"));//n이라고 입력하면 반복문 탈출, y라고 입력하면 다시 반복
		
		sc.close();//스캐너 객체 닫아준다.
		
	}

}
