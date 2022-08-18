//Call by Reference
//참조연산, c언어의 포인터와 유사
package class_211217;

public class Ex_02 {
	//해당 메소드는 return값이 없지만 배열 매개변수에 의해 참조연산이 실행돼 저장된 변수의 값이 바뀐다.
	
	public void increase( int[] n) {
		//n.length 배열의 길이
		for(int i = 0; i <n.length; i++) {
			n[i]++;
		}
	}
	

	public static void main(String[] args) {
		int [] ref1 = {100, 800, 1000};
		Ex_02 ref = new Ex_02();
		//초기 배열 변수의 값만 출력
		for(int i = 0; i <ref1.length; i++) {
			System.out.println("ref1[" + i + "] :" + ref1[i]);
		}
		
		//increase 메소드 실행
		ref.increase(ref1);
		System.out.println();

		System.out.println("메소드 호출 후");
		//메소드 실행 후 배열 변수의 성분값이 변화한 것을 확인
		//이것이 Call by Reference의 힘

		for( int i = 0; i <ref1.length; i++)
		{System.out.println("ref1[" + i + "] :" + ref1[i]);
	}

}
}
