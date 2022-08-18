package class_211213;

public class Ex_07 {

	public static void main(String[] args) {

		int [] s = new int[10];
		//여기서 element 즉 배열의 요소의 값은 0~9 로 10개이다.
		
		for ( int i = 0; i < s.length; i++)
			//s.length= 10 따라서 i가 10보다 작으면 아래 문장 계속 실행
			s[i] = i;
			//s[i]에 i값을 대입한다.
		
		System.out.println(s);
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
			//s[i] 값을 출력한다. 
	}

}
