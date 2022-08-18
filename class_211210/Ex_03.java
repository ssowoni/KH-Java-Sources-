package class_211210;
//이중for문, 중첩for문
public class Ex_03 {

	public static void main(String[] args) {
		
		int i, k;//변수선언
		
		for(i=2; i<=9; i++) {//2단부터 9단까지
			for(k=1; k<=9; k++)
			{//각 단마다 곱해지는 수 (1~9)
				System.out.printf("%d x %d = %d\n", i, k, i*k);
				//printf의 서실 부분은 쉼표(,)로 구분 짓지 않는다.
			}
			System.out.println();
		}

	}

}
