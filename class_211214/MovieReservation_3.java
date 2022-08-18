package class_211214;

import java.util.Scanner;

public class MovieReservation_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //스캐너 객체 생성
		int [] seat ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 배열 seat에 초기값 저장
		int [] seatReservation = {0,0,0,0,0,0,0,0,0,0}; // 배열 seatReservation에 초기값 저장
		int seatNumber = 0;
		//int i=0;
		
		//boolean Run = true;
		while(true) { //while문 무한루프 시작
			
			for(int st : seat)  // seat 배열을 가져온다.
				System.out.printf("%-3d",st); //%-3d 는 숫자 나오고 2칸 띄고 숫자 나오고 2칸 띄고
			System.out.println();
			
			for(int st : seatReservation) // seatReservation 배열을 가져온다.
				System.out.printf("%-3d",st);
			System.out.println();

	
			System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1) : ");
			seatNumber = sc.nextInt();// 입력받은 값을 seatNumber에 저장
			
			
			
			if (0< seatNumber && seatNumber <=10)
			{	// 만약 입력받은 값이 0보다 크고 10보다 작거나 같다면 아래문장 실행
				if(seatReservation [seatNumber-1] ==0) {
					// seatNumber-1은 좌석은 1부터 시작하고 seatReservation[0] 부터 시작하기에 -1 해줬다.
				seatReservation[seatNumber-1] =1;
				// 만약 예매 되지 않은 좌석이라면 그 좌석에 1을 대입한다. 
				System.out.println("예약되었습니다");
				
				} else//(seatReservation [seatNumber-1] ==1)
					System.out.println("이미 예약된 자리입니다.");
				// seatReservation [seatNumber-1]에 0이 아닌 다른 숫자가 있다면 이미 예약된 자리 
			} else if (seatNumber >10 )  // 입력한 값이 10보다 크다면 아래 문장 실행
				System.out.println("1~10까지 입력하세요");
			else if (seatNumber == -1) // 입력한 값이 -1 이라면 아래 문장 실행 
				break; //Run = false; while문을 빠져나간다.
			
			System.out.println("=====================================");	
			
		}
		//while (seatNumber!= -1);
			
		System.out.println("프로그램 종료합니다.");	
		sc.close();
	}

}
