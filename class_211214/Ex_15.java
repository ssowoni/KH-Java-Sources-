package class_211214;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너 사용 선언
		int s [] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//배열 선언 및 초기화( 데이터 저장)
		int value, index = -1; // -1 or 999 배열내 값에 그냥 벗어난 값을 쓰기 위해서 
		//탐색 값, 탐색 위치 정의
		System.out.printf("탐색할 값을 입력하시오: ");
		value = sc.nextInt();//탐색값 입력
		
		for(int i = 1; i < s.length; i++) {// s.length 값은 11
			if (s[i] == value) //배열 내 값을 입력 받은 값과 비교
				index = i;
		} //같을 때 횟수(저장공간)확인
		if ( index< s.length && index >= 0)
			//저장공간이 배열 범위 내에 있을 때
			System.out.println(" " + value + "값은 " + (index +1) + "위치에 있습니다.");
		
		sc.close();
		
	}

}
