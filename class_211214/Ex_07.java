package class_211214;

public class Ex_07 {

	public static void main(String[] args) {
		
		int[][] aa = new int [3][4];
		int i, k;
		int val =1;
		
		//앞에 Ex_06과 같은 값을 출력하기 위한 깔끔한 코드! 
		//이중 for문을 이용하였다.
		for(i =0; i <3; i++) {//aa[i][k]에서 i값은 행을 나타낸다. 0~2 총 3행
			for(k =0; k <4; k++) {
				//aa[i][k]에서 k의 값은 열을 나타낸드 0~3 총 4열
				aa[i][k] = val; //a[0][0] = 1 ; val의 값이 처음에 1로 초기화 됐기 때문
				val++;//val 의 값은 1씩 증가한다 
				System.out.printf("aa[%d][%d] = %d\t", i, k, aa[i][k]);
			}
			System.out.println("\n");
		}

	}

}
