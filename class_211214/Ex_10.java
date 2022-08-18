package class_211214;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char[] stack =new char[5];
		int top = 0;
		
		
		char carName='A'; //문자열 carName에 'A'로 값 초기화
		int select = 9;//select 값은 while 반복문을 위해 그냥 임의의 정수로 저장한 것
		
		while(select != 3) { //select 값이 3이면 반복문 탈출
			System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
			select = sc.nextInt(); // 숫자 입력 받아서 select에 저장한다.
			switch (select) {
			case 1:
			if (top >= 5) {//배열의 크기가 5이기에 5대 까지 차량 받을 수 있다.
				System.out.println("터널이 꽉 차서 차가 못들어감");
			}else {
				stack[top] = carName++; //'A'문자열 'A'에 +1 하면 'B'
				System.out.printf(" %c 자동차가 터널에 들어감\n", stack[top]);
				top++;//top에 +1을 해준다 즉) stack[index+1]
			}
				break;
			case 2:
				if(top <= 0) { //배열 stack 안에 저장된 값이 하나도 없으면?
					System.out.println("터널 안에 자동차가 모두 빠져나감");
				}else {
					top--; // stack[index-1]
					System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
					stack[top] =' ';
					carName--; // 이게 없으면 carName이 계속 증가
					//차량이 빠져나가면 C-> B -> A이런식으로 차량 이름도 바꿔줘야 한다.
				}
				break;
			case 3:
				System.out.printf("현재 터널에 %d대가 있다.\n", top);
				System.out.printf("프로그램을 종료합니다.\n");
				break;
			/*
			 * default: System.out.println("1, 2, 3 중 입력하세요.");
			 */
			}
		}
		sc.close();

	}

}
