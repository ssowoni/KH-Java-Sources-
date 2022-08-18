package class_211224;

public class Ex_07_12 {

	public static void main(String[] args) {
		//Math.PI : Math 객체를 활용해 원주율 상수를 사용할 수 있음
		System.out.println(Math.PI);
		double a = 3.75;
		//ceil : Math 객체 내장 메소드로, 올림 메소드이다.
		System.out.println(Math.ceil(a));
		//floor : Math 객체 내장 메소드로, 버림 메소드이다
		System.out.println(Math.floor(a));
		//sqrt : Math 객체 내장 메소드로, 제곱근 메소드이다
		System.out.println(Math.sqrt(9));
		//★ round : Math 객체 내장 메소드로, 반올림 메소드이다.
		System.out.println(Math.round(3.14));
		System.out.println("이번주 행운의 번호는");
		for(int i=0; i < 6; i++)
			
			//Math.random() : 0~1(0.999999999)사이의 실수를 랜덤으로 출력하는 메소드
			//0부터 random()에 곱한 수의 -1까지 만큼 난수가 출력되어 앞에 (int) 강제 형변환을 통해
			//0~(곱한수 -1) 만큼의 정수 난수 범위가 정해진다
			//여기에 1을 더하면 1~ 곱한수 만큼의 난수 범위가 확정됨
			//만약 음수를 활용하고 싶다면 소괄호 밖에 -1을 곱해주면 된다.
		System.out.print((int)(Math.random()*45+1) + " ");
		System.out.println();
		System.out.println();
		
//		int rNum[] = new int[9];
//		//숫자의 범위
//		boolean room [] = new boolean[9];
//		int index = 0;
//		int rnd;
//		while(index < 9) {
//			rnd =(int)(Math.random()*9);
//			if(!room[rnd]) {
//				room[rnd] = true;
//				rNum[index] = rnd +1;
//				index ++;
//			}
//		}
//		for (int i = 0; i<rNum.length; i++) {
//			System.out.print(rNum[i]+ " ");
//			if((i+1)%3 ==0) {
//				System.out.println();
//			}
//		}

	}
	
	//필요한 숫자의 개수(rNUM) 만큼 boolean형 배열 선언
	//랜덤 숫자 (rnd)를 뽑고 boolean [rnd] = false일 때만 
	//랜덤 숫자 (rnd)의 값을 필요한 숫자의 배열(rNum)에 순차적으로 넣어준다.
//9개 나오는 결과 창에 6개의 숫자가 중복되지 않게 출력되게 하자! 
}
