//return
package class_211213;

public class Ex_03_return {

	public static void main(String[] args) {
		
		int hap = 0;
		int i;
		
		for ( i = 1; i <= 100; i++){
			hap += i; //1부터 100까지 합계를 누적한다
			
			System.out.printf("1부터 %d까지의 합은 %d 입니다 \n", i, hap);
			//System.out.printf("1부터 100까지의 합은 %d 입니다 \n", hap);
			//합계출력
			
			if(hap > 5000) //만약 hap이 5000이상이 되면 아래 문장 실행
			
				return; // 현재 메소드를 호출한 곳으로 복귀한다
		}
		System.out.println("프로그램의 끝입니다");//한번도 실행되지 않는다.

	}

}
