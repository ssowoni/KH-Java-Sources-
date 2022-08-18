package class_211216;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너 객체 생성
		int[] numbers = {10, 20, 30};
		//int형의 numbers 배열에 초기값을 줬다. 1
		
		//확장 for문 형태
		//for문 안에 변수를 선언하고, 변수에 배열 변수의 값을 입력
		for(int value:numbers)
			//printf("%d", value) : %d(정수형 포멧스트링)을 활용해
			//정수형 변수 value에 저장된 값을 출력
			//value에 배열 numbers의 값을 넣는다. 
		System.out.printf("%d ",value);
		
		sc.close();
	}
}
