package class_211217;

public class Ex_01 {

	//(반복) 객체 생성 해줬기 때문에 static 사용 안 해도 된다. 
	public int increase(int n) {
		// ++n : 전위 연산자, ++연산을 먼저 한 후 출력
		//해당 줄에서 가장 먼저 연산이 수행된다.
		//n++ : 후위 연산, 연산 결과는 줄이 바뀐(; 기호가 개행(줄 바꿈)이라는 뜻) 후 연산 수행된다.
		//기존값 출력(n먼저) 후 ++연산 나중 이런 식으로 외우면 편하나다.
		
		++n; //return 값 101 
		//n++; -> return값이 100이 나온다. 
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		//객체생성
		Ex_01 val = new Ex_01();
		//객체의 메소드를 활용해 result에 연산 결과를 저장한다.
		int result = val.increase(var1);
		System.out.println("var1 :" + var1 + ", result : " + result);
		

	}

}
