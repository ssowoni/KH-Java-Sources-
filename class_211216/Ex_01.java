//배열의 행과 열의 각각 합
//for문에서 영역 오류 났다. 에러 코드 작성
package class_211216;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//내장 클래스인 scanner 변수 생성
			//scanner 객체변수를 활용해 scanner 클래스의 메소드를 활용
		
		int [][] aa = new int [][] { { 2, 3, 0}, {8, 9, 1}, {7, 0, 5}};
		//2차원 배열 선언, 크기를 설정하지 않았지만 초기화 하는 과정에서 크기가 3x3으로 지정됐다. 
		int sum = 0;
		
		for(int i = 0; i <aa.length; i++) {
			//aa.length 행의 개수를 나타낸다, length 메소드 활용
			for( int j = 0; j < aa[i].length; j ++) 
				//aa[i].length 해당 행의 열의 개수를 나타낸다. 
				
				sum += aa[i][j];
				//내부 for문을 도는 동안 외부 행을 고정되기 때문에 해당 행에 있는 데이터들의 합이 구해진다.
				//sum +=aa[i][j] : sum = sum + aa[i][j] 이런 뜻이다.
				System.out.println(i +1 + "행의 합은" + sum);
				//i+1이라고 나타내느 것은 배열이 0부터 시작하기 때문에 
				sum = 0;// 내부 루트가 끝나면 합을 초기화 한다. -> 다음 행을 계산하기 위해서 	
		
		
		}
		System.out.println();
		for(int i = 0; i <aa.length; i++) {
			for( int j = 0; j < aa[i].length; j ++) 
				sum += aa[j][i];
				//행과 열의 위치가 바뀜, 위에서는 aa[i][j]였고
				//행과 열의 위치를 뒤바꿈 함으로써 해당 열의 값을 더하는 식이 완성된다.
				
				System.out.println(i+1+"열의 합은"+sum);
				//i열이 고정인 상태에서 행의 값의 합 
			
			//System.out.println();
		}
			sc.close();
			//System을 건드리는 Scanner 클래스 변수인 scanner을 종료시킨다. 
}
}
