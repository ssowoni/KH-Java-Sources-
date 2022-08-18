//약수구하기 직접 코드 짜보자
package class_211213;

import java.util.Scanner;

public class Ex_04_practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성
		System.out.print("양의 정수를 입력 : ");
		int n = sc.nextInt();//int n에 입력한 값이 저장된다.

		System.out.println(n + "의 약수는 다음과 같다");
		for(int i=1; i<=n; i++ )
		{//i가 1부터 시작해서 입력한 값보다 커질 때까지 반복한다.
			if(n%i==0) {//n입력받은 값을 i로 나눴을 때 0이 되면 i는 n의 약수가 된다. 
				System.out.print(" " + i );//0이 되면 그 값을 출력한다.
			}
		}
		
		sc.close();
	}

}
