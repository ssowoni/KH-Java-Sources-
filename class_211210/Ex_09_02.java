package class_211210;

import java.util.Scanner;

public class Ex_09_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		int i;
		//입력받은 값보다 작은 소수 출력하기 
		for( i =2; i<=num; i++) {
			if( i == 1) {
				i ++;
			}
			if(i ==2) {
				System.out.printf("%d\n" , i);
			}
			if(i ==3) {
				System.out.printf("%d\n", i);
			}
			if ( i==5) {
				System.out.printf("%d\n", i);
			}
			if(i==7) {
				System.out.printf("%d\n",i);
			}
			if((i % 2) != 0) {
				if((i % 3) != 0) {
					if((i % 5) != 0) {
						if((i % 7) != 0) {
							System.out.printf("%d\n", i);
						}
					}
				}
			}
		}
		sc.close();
}
}
