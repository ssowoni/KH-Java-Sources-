package class_211214;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col; //행, 열을 나타내는 변수 생성
		
		System.out.printf("행 개수를 입력: ");
		row = sc.nextInt();
		System.out.printf("열 개수를 입력: ");
		col = sc.nextInt();
		
		int [][] aa= new int [row][col];
		//입력받은 row 값을 행, col값을 열로 aa배열 선언한다.
		
		int i,k;
		int val =1; // 1로 초기화
		
		//aa배열에 val값 저장해주기
		for(i = 0; i < row; i++ ) {
			for(k = 0; k < col; k++ ) {
				aa[i][k] = val; // val의 값은 value 이거는 aa[i][k]의 각각 배열에 val값을 저장해 주는 코드
				val++; // val = val+1
			}
		}
		//aa[i][k]에 저장된 값을 출력하기
		for(i = 0; i < row; i++ ) {
			for(k = 0; k < col; k++ ) {
				System.out.printf("%3d", aa[i][k]);
				
			}
			System.out.println("\n");
		}
		
		
		
		
		
		sc.close();

	}

}
