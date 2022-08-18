// 숫자가 올라가면 오름차순 
package class_211216;

import java.util.Arrays;
//import 받아야 된다! 

public class Ex_07 {

	public static void main(String[] args) {
		final int SIZE = 10;
		
		int[] numbers = new int[SIZE];
		for(int i = 0; i < SIZE; i++)
		{
			int r = (int) (Math.random() * 100);
			//랜덤 메소드를 활용해, 0~99까지 SIZE 수 만큼 난수 생성
			//Math.random() : 0이상 1미만의 난수가 생성되는데
			//뒤에 발생시키고 싶은 난수 -1 까지의 범위를 결정하는 수 (여기서는 100)을 지정
			//앞에 int로 형변환 시켜 정수형으로 사용한다. 
			
			numbers[i] = r; 
			//0~99까지 랜덤 실수 발생한 다음 number[i]에 값을 저장한다. 
		}
		
		System.out.print(" 최초의 리스트: ");
		
		for ( int r : numbers)
			//확장 for 문을 활용해 배열에 저장된 데이터를 출력한다.
			System.out.print(r + " ");
		
		Arrays.sort(numbers);
		//import 받아야 된다! 
		//sort : 배열의 모든 성분을 오름차순으로 정리하는 메소드 
		//데이터 정렬 메소드 => 배열의 데이터를 내림차순 정렬 numbers배열에 적용
		System.out.print("\n 정렬된 리스트: ");
		
		for (int r : numbers)
			//확장 for문을 활용해서 정렬된 배열을 재 출력
			System.out.print(r + " ");

	}

}
