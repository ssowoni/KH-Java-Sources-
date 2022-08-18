package class_211214;

public class Ex_03_array {

	public static void main(String[] args) {
		int aa[] = { 100, 200, 300, 400}; //aa배열 선언, 초기값 저장
		int bb[] = new int[] {100, 200, 300}; 
		// bb배열 선언, new라는 연산자와 함께 bb배열 생성, 초기값 저장
		
		int cc[]; //cc배열 선언
		cc = new int[] {100, 200}; //cc배열 생성, 값 저장
		int [] dd = new int[1]; // dd배열 선언 = dd배열 생성
		dd[0] = 100;// dd배열의 값 저장
		int i;
		
		for (i = 0; i < 4; i++ ) 
			//i=0부터 3까지 반복한다.
			System.out.printf("aa[%d] ==> %d\t", i, aa[i]);
			//aa[0]~aa[3]까지 출력한다.
		System.out.println("\n");
		
		for (i = 0; i < 3; i++ ) 
			System.out.printf("bb[%d] ==> %d\t", i, bb[i]);
		System.out.println("\n");
		
		for (i = 0; i < 2; i++ ) 
			System.out.printf("cc[%d] ==> %d\t", i, cc[i]);
		System.out.println("\n");
		
		for (i = 0; i < 1; i++ ) 
			System.out.printf("dd[%d] ==> %d\t", 0, dd[0]);
			//d의 값은 하나밖에 없으므로 그냥 바로 0 대입
		System.out.println("\n");
	}

}
