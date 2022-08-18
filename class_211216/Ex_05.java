package class_211216;

public class Ex_05 {

	public static void main(String[] args) {
		int [][] array = { {10, 20, 30, 40}, 
				{50, 60, 70, 80}, 
				{90, 100, 110, 120}};
		//3행 4열 크기의 array 배열 생성 
		
		for(int r = 0; r <array.length; r++) { // 각 행을 반복한다 행의 크기 3
			for(int c = 0; c <array[r].length; c++) // 각 열을 반복한다. 열의 크기 4
				System.out.println(r + "행" + c + "열 : " + array[r][c]);
			//각 행과 열에 있는 값을 출력한다. 
			System.out.println();
		}

	}

}
