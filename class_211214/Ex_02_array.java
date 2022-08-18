package class_211214;

import java.util.Scanner;

public class Ex_02_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[4]; // 배열의 선언과 정의를 한 번에 해줬다.
		int hap = 0, i; // int hap = 0 int i;랑 같은 문장
		
		for(i=0; i<=3; i++) {
			System.out.printf("%d번째 숫자를 입력하세요: ", i+1);
			//배열은 0번째부터 시작하기에 i+1로 %d에 값을 줘서 보기 편하게 만들었다.
			aa [i] = sc.nextInt(); // 배열에 입력받은 값을 저장한다.
		}
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		//합은 입력받은 값을 모두 더한 값
		System.out.printf("합계 ==> %d\n", hap);
		
		sc.close();
	}

}
