package class_211210;

public class Ex_15 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		
		myLabel: for(;;) {//무한루프와 레이블 표시
			for (i = 1; i <= 40; i++){
				hap += i;
				if(hap > 2000) {// hap이 2000보다 크면 아래 문장 실행
					System.out.printf("%d\n",hap);
					//hap = 0;
					break myLabel;
					//hap이 2000보다 크면 무한루프를 빠져나간다. 조건 안 주면 아직도 반복 중 무한 생성
				}
				
			}
			//만약 for문 조건에서 i<100이 아닌 i < 50을 준다면 i의 합이 2000본다 작아서 아래 문장이 실행된다. 
			//이 코드에서는 2000이 넘기에 아래 코드 출력 안 된다.
			System.out.printf("아직도 반복중...\n");
		}
		

	}

}
