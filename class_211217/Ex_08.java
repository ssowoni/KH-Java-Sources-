package class_211217;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum =0, n=0;
		//for문을 통해 3개의 변수를 입력 받는다.
		for(int i = 0; i <3; i++) {
			System.out.print(i + ">>");
			//try 내부 코드에 에러가 없으면 try 내부 코드가 실행되지만 오류가 있을 경우 catch문이 실행된다. 
			
			try {
				n = sc.nextInt(); // 정수 입력
			}
			//만약 정수가 아닐 경우 catch문 실행
			catch(InputMismatchException e) {
				System.out.print("정수가 아닙니다 다시 입력하세요! ");
				System.out.println();
				sc.next();
				//입력 스트림에 있는 정수가 아닌 토큰을 버린다
				//for문 증가를 취소시키고
				i--; // 정수가 아닌 다른 수를 입력받았을 때 i--값을 해주지 않으면 이 값도 하나의 값으로 받아서 for문이 실행된다.
				
				//continue 문을 통해 루프를 다음으로 이동시킨다.
				//컨티뉴 문이 반복문 내에서 실행되면 이후 반복문을 실행하지 않고 다음 반복문 실행
				continue;

			}
			sum += n;
			//문제가 없다면 try문이 실행되어 정상입력 받고 값을 합한다.
		}
		System.out.println("합은" + sum);
		sc.close();

	}

}
