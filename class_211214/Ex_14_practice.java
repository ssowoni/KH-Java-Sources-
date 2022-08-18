package class_211214;
//최소값 구하기
public class Ex_14_practice {

	public static void main(String[] args) {
		
		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int minimum = s[0]; 
		// 각각 배열의 값을 비교해야 함으로 초기값을 s[0]으로 지정했다.
		int maximum = s[0];
		
		for ( int i =0; i < s.length; i++) {
			//배열의 길이는 9 
			if( minimum > s[i]) {
				//초기화 시킨 배열 s[0]의 값과 index를 하나씩 증가시켜 그 자리에 있는 값을 비교한다.
				//비교한 값이 더 작은 수를 minimum에 저장한다.
				minimum = s[i];
			}
			}
		
		for ( int i =0; i < s.length; i++) {
			if( maximum < s[i]) {
				maximum = s[i];
			}
			}
		System.out.println("최소값은 : " + minimum);
		System.out.println("최대값은 : " + maximum);

	}

}
