package class_211214;

public class Ex_08 {

	public static void main(String[] args) {
		int[][] aa = {//배열에 초기값 지정한다. 
				{1, 2, 3, 4}, //,(컴마) 붙여줘야 된다!
				{5, 6, 7, 8},//2행
				{9, 10, 11, 12}//3행
			};
		
		int i, k ;
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력 ");
		
		for(i = 0; i <3; i++) { //행의 index
			for(k = 0; k <4; k++) {//열의 index
				System.out.printf("%-3d", aa[i][k]);
			}
			System.out.println("\n");
		}

	}

}
