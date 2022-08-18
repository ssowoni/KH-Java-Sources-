package class_211214;

import java.util.Scanner;

public class Ex_04_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] aa = new int [100]; 
		//aa라는 배열을 생성하고 new int[100]으로 선언했다.
		//아직 배열의 index에 각각 할당된 값은 모르는 상태
		int bb[] = new int[100]; // 배열 bb를 생성하고 선언한다.
		int i;
		
		for(i = 0; i<100; i++)
			aa[i] = i * 2;
		//배열 각각 index에 0~99까지 값을 할당한다.
		//aa[0] = 0, aa[1] =2, aa[2] =4 ,,, 2의 배수로 커진다
		
		for(i =0; i <100; i++)
			bb[i] = aa[99 - i];
		//bb[0] = aa[99], bb[1] = aa[98]
		
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨 \n", bb[0], bb[99]);
		// bb[0], bb[99] or a[99], a[0] 이렇게 써줘야 된다. 
		System.out.println(bb[0]+ ", " + bb[1] + ", "+ bb[98] + ", "+ bb[99]);

		sc.close();
	}

}
