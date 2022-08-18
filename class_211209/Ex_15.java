package class_211209;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단: ");
		
		int num = sc.nextInt();
		int i = 1;//곱하는 수
		if(num >=1)//조건문 if num의 값이 1이상이면 아래 문장이 실행된다
		{
			while ( i<=9) {//반복문: i값이 9이하이면 밑에 문장 반복 실행
				//1부터 9까지 곱하는 구구단을 나타낸다
				System.out.print(num + " * " + i + " = " +num*i + "\n");
				i++;
			}
		}else 
			System.out.println("잘못 입력");
		sc.close();
	}

}
