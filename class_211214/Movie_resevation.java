package class_211214;

import java.util.Scanner;

public class Movie_resevation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int [] seat ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int SIZE = 10;
		//int seatReservation [] = new int[SIZE];
		int [] seatReservation = {0,0,0,0,0,0,0,0,0,0};
		int seatNumber = 11;
		//int i=0;
		
		//while(true) 
		do{
			
			for(int st : seat) 
				System.out.printf("%-3d",st);
			System.out.println();
			
			for(int st : seatReservation) 
				System.out.printf("%-3d",st);
			System.out.println();

			//좌석 안 된 배열을 출력해야 된다. 
	
			System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1) : ");
			seatNumber = sc.nextInt();
			
			
			
			//if(seatReservation[seatNumber]== 0) {
			//처음에 이렇게 작성했더니 2번자리에 예약이 돼있어도 계속 예약되었습니다 멘트 출력
			if(seatReservation[seatNumber-1] == 0) {
				
				seatReservation[seatNumber-1] =1;
				//seatReservation[seatNumber-1] +=1;
				//처음에 이렇게 입력했더니 계속 자리의 값이 더해졌다. 2,3,4,,, 커졌다. 
				System.out.println("예약되었습니다");
				
			} 
		
			else if (seatReservation[seatNumber-1]== 1) {
				System.out.println("이미 예약된 자리입니다.");
			}
			//else if (seatNumber==-1)
				//break;
			
				
				//if(seatNumber==seatReservation[SIZE])
					//++seatReservation[SIZE];
				
			
			System.out.println("=====================================");	
			
		}
		while (seatNumber!= -1);
			
		System.out.println("프로그램 종료합니다.");	
		sc.close();
		
	}

}
