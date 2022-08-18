//확장 for문
package class_211214;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int [] a = new int [] {23, 45, 67, 789, 2} ;
		//배열 생성, 선언, 초기값 저장
		
		for( int k : a) { //확장 for문 형태,  k 는 변수 a는 배열
			System.out.println("k= " + k);
		}
		
		int[] c;
		c = new int[] {23, 45, 67, 789, 2};
		
		// 이 문장도 일반 for 문으로 바꿔보기 
		//System.out.println("=================================");
		
		for(int b=0; b<=40; b++)
			System.out.print("=");
		System.out.print("\n");
		
		//for(int k :c) 일반 포문으로 바꿔보기 
		for(int k = 0; k < c.length; k++) {
			System.out.println("k= " + c[k]);
			//에러 노트 작성 c가 아니라 a배열을 이용했고 (값이 똑같아서) 뭐 이건 상관 없지만
			// c[k]가 아니라 처음에 k를 입력했더니 값이 0,1,2,3,4이 나왔다.  
		}
		sc.close();

	}

}
