package class_211210;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		int max, min;
		Scanner sc = new Scanner(System.in);
		//스캐너 객체 생성
		System.out.println("첫 번째 정수 : ");
		int i = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int k = sc.nextInt();//int값을 입력 받는다
		
		if(i>k) { //i가 k보다 크다면 max=i
			max = i;
			min = k;
		}else {//i가 k보다 작다면 max=k
			max = k;
			min = i;
		}
		System.out.printf("큰수는: %d, 작은수는: %d " , max, min);
	
		sc.close();
		
	}

}//min 작은수 구해보기
