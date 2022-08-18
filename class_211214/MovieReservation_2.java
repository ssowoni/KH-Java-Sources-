package class_211214;

import java.util.Scanner;

public class MovieReservation_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] seat = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int SIZE = 10;
		// int seatReservation [] = new int[SIZE];
		int[] seatReservation = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int seatNumber = 0;
		int i = 0;

		// while(true)
		do {

			for (int st : seat)
				System.out.printf("%-3d", st);
			System.out.println();

			for (int st : seatReservation)
				System.out.printf("%-3d", st);
			System.out.println();

			// 좌석 안 된 배열을 출력해야 된다.

			System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1) : ");
			seatNumber = sc.nextInt();

			
			/*if( seatNumber <=10 ) {
				if ( seatReservation [i] ==0 )
				{
					
			}
			*/
		
			  for( i=1; i<=seatReservation.length; i++ ) { 
				  if(seatReservation[i-1]==0) {
			  if(seatNumber-1==i) { 
				  seatReservation[i] =1; 
				  System.out.println("예약되었습니다");
			  }
				  }
			  //i=seatNumber; } } else if(seatReservation[i-1]==1) { if(seatNumber-1 == i)
			 System.out.println("이미 예약된 자리입니다"); //if(seatNumber == i) //break; }
			 
				/*
				 * if( seatNumber-1 == i) { seatReservation[i] =1; }
				 */
			  
			 /*System.out.println("예약되었습니다"); }
			 

			
			  for( i=0; i<seatReservation.length; i++ ) { 
				  if(seatReservation[seatNumber] ==
			  }
			  1) System.out.println("이미 예약된 자리입니다.");
			 
			 */
			 

			System.out.println("=====================================");

			  }
		} while (seatNumber != -1);

		System.out.println("프로그램 종료합니다.");
		sc.close();

	}
}
