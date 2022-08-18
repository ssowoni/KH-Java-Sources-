//비정방형 배열 ( 각 행의 열의 개수가 다른 배열)
package class_211216;

public class Ex_04 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		//배열의 행 개수만 지정함, 열은 비워뒀다.
		
		//각 행의 열 개수는 아래와 같이 별도로 지정할 수 있다. 
		intArray[0] = new int [3];
		intArray[1] = new int [2];
		intArray[2] = new int [3];
		intArray[3] = new int [2];
		
		
		//2차원 for문을 활용해, 배열의 각 요소에 데이터를 입력한다.
		for ( int i =0; i <intArray.length; i++) //행
			for(int j=0; j < intArray[i].length; j++)//열
				intArray[i][j] = (i+1) * 10 + j;
				//배열 성분의 행과 열의 위치에 따라 저장되는 값을 다르게 한다.
				//행 :10의 자리, 열 : 1의 자리 
		
		//각 행과 열의 값을 출력하기 위한 코드 
		for ( int i =0; i <intArray.length; i++) {
			for(int j=0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		
			
		}
				
	}

}
