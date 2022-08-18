package class_211210;

import java.util.Random;

public class PhoneNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int i = 1;
		while(i<13) {//12자리 전화번호 생성한다.
			for(i=1; i<5; i++)
			{//000- 표현하기 위해서 for문으로 4번째 자리까지 표현
				if(i==1)//첫 번째 자리는 숫자 0으로 고정
					System.out.print(0);
				else if (i==2)//두 번째 자리는 2부터 6사이의 정수
					System.out.print(rand.nextInt(4)+2);
				else if (i==3)//세번 째 자리는 1부터 7사이 정수
					System.out.print(rand.nextInt(6)+1);
				else if (i==4)//네 번재 자리는 연좌부호(-)를 추가한다.
					System.out.print("-");	
			}
				
		for(i=5; i<8; i++)
		{//5~7번째 자리는 랜덤으로 0부터 9자리의 정수로 만든다
			System.out.print(rand.nextInt(10));
		}
		
		if(i==8) {//8번째 자리는 연좌부호 (-)를 추가한다
			System.out.printf("-");
			
		}
		for(i=9; i<13; i++)
		{//9~12번재 자리는 랜덤으로 0부터 9까지 정수로 만든다.
			System.out.print(rand.nextInt(10));
		
		}
		}

	}
}