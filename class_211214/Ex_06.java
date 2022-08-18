//이차원 배열 
package class_211214;

public class Ex_06 {

	public static void main(String[] args) {
		
		int [][] aa = new int [3][4]; // int 행 열;
		
		aa[0][0] = 1; aa[0][1] = 2; aa[0][2] = 3; aa[0][3] = 4;
		//1행 1~4열의 초기값을 지정해주기
		aa[1][0] = 5; aa[1][1] = 6; aa[1][2] = 7; aa[1][3] = 8;
		//2행 2~4열의 초기값 지정해주기
		aa[2][0] = 9; aa[2][1] = 10; aa[2][2] = 11; aa[2][3] = 12;
		//3행 3~4열의 초기값 지정해주기 
		System.out.println("aa[0][0] 부터 aa[2][3]까지 출력");
		
		System.out.printf("%3d %3d %3d %3d\n", aa[0][0], aa[0][1], aa[0][2], aa[0][3]);
		//%3d는 2칸을 띄어서 쓴다는 이야기 ..1..2..3 이런식으로
		//뒤에 설명 나와있지만 만약에 -3이면 1..2..3.. 이런식으로 나온다.
		System.out.printf("%3d %3d %3d %3d\n", aa[1][0], aa[1][1], aa[1][2], aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[2][0], aa[2][1], aa[2][2], aa[2][3]);
		
		

	}

}
