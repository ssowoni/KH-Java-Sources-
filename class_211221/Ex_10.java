package class_211221;

public class Ex_10 {

	public static void main(String[] args) {
		
		Ex_10StaticSample.m = 10;
		
		Ex_10StaticSample s1;
		s1 = new Ex_10StaticSample();
		//위에서 입력된 10이 출력된다. 
		
		System.out.println(s1.m);
		//이후 f()메소드가 실행되면 m= 5가 된다.
		//이 역시 잘못된 표현식으로 아래와 같이 Ex_10StaticSample.f() 이렇게 표현해야 한다.
		s1.f();
		Ex_10StaticSample.f();
		//아래는 내가 이해를 위해 넣은 코드! 
		//즉 static 메소드가 선언되기 전에는 원래 있던 값, 선언된 후에는 static 값이 출력된다. 
		System.out.println(s1.m);

	}

}
