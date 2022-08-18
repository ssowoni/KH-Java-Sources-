package class_211213;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] s = new int [4];//0~3 총 4자릿수의 배열을 받는다.
		//배열의 값을 모르기에 new int[4]로 선언한다.
		int hap = 0; 
		
		for(int i =0; i <s.length; i++) {//s.length의 값은 4! 
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			//(i+1)번째 라고 나타낸거는 배열의 첫 번째 자리는 0부터 시작하기 때문에 출력했을 때 보기 편하라고 이렇게 나타냄
			s[i] = sc.nextInt(); //s[i]의 값을 입력받는다.
		}
		
		for( int i = 0; i < s.length; i++) {
			hap += s[i]; // hap = hap + s[i]
		}
		System.out.println("합계 == > " + hap);
		
		sc.close();

	}

}
