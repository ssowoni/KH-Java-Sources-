//메소드 알아보기 시작! 
package class_211216;

public class Ex_09 {

		//static 메소드 선언
		//static을 선언하면 객체가 활용되는 순간 static 메소드에 메모리가 할당돼 바로 활용할 수 있게 된다.
		static int[] makeArray() {
			//↓ 크기가 4인 temp 배열 생성
			//new 연산자는 객체를 Heap이라는 메모리 영역에 메모리 공간을 할당해주고 메모리 주소를 반환한 후 생성자를 실행시켜준다. 
			int temp[] = new int[4];
			for(int i = 0; i< temp.length; i++) {
				//배열 길이 만큼, 0~3까지 수를 배열에 저장
				//temp.length : 배열에 저장된 데이터 수를 계산
				temp[i] = i;
			}
			//return을 통해 값은 intArray 배열에 저장 
			return temp;
		}
		
		
	
		public static void main(String[] args) {
			//static이란?  메모리에 먼저 상주되어 올라간다. 공동 작업이다. 
			int intArray[];
			//makeArray() 메소드 결과를 배열 변수에 입력
			intArray = makeArray();
			//for문을 통해 makeArray() 메소드의 결과값을 출력함 
			for(int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[i] + " ");
			}

	}

}
