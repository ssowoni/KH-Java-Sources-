//주사위를 10000번 굴렸을 때 각 면이 나오는 횟수
package class_211214;

public class Ex_16 {

	public static void main(String[] args) {
		//사이즈를 생성해서 배열로
		final int SIZE = 6;
		// 주사위 6면체 상수 선언
		int freq[] = new int [SIZE];
		//6개의 공간을 갖는 배열 선언
		
		for (int i= 0; i < 10000; i++)
			++freq[(int)(Math.random()*SIZE)];
		//Math.random()은 0~1미만의 난수를 생성한다. 
		//Math.random() * SIZE : 0~5사이의 난수 발생 후 int 형변환, 
		//배열 공간 설정
		//++freq 난수가 발생할 때 마다 해당 공간에 +1  ++는 전위연산자
		// 이 말은 즉슨 0~5까지 난수가 발생, 그럴때 마다 ++freq[index] 해당값에 값이 +1이 된다는 것!!  
		
		System.out.println("=============");
		System.out.println("면빈도");
		System.out.println("=============");
		
		for( int i =0; i < SIZE; i++)
			System.out.println("" + (i+1) + "\t" +freq[i]);
		//0~5를 i+1로 1~6
	
	}

}
