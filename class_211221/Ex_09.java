package class_211221;

public class Ex_09 {

	public static void main(String[] args) {
		Ex_09StaticSample s1, s2;
		//s1을 Ex_09StaticSampled의 객체로 선언 
		s1 = new Ex_09StaticSample();
		//s1 객체의 변수 n 의 값에 5를 저장한다. 
		s1.n = 5;
		//s1 객체에 g 메소드 호출
		//둘 중 어디에도 print가 없어서 출력은 안 됨.
		s1.g();
		System.out.println(s1.m);
		//s1 객체의 변수 n 의 값에 50을 저장한다. 
		s1.m = 50; // static 변수
		System.out.println(s1.m);
		//System.out.println(s1.g());
		
		
		
		//s2를 Ex_09StaticSampled의 객체로 선언 
		s2 = new Ex_09StaticSample();
		s2.n = 8;
		s2.h();
		//Ex_09StaticSample.f() : static 멤버는 객체 생성 이전에 메모리에 할당되므로 
		//객체와 별도로 클래스 명을 활용해 직접 사용이 가능하다.
		//static 메소드는 원래 객체 생성 없이 바로 사용해야 하지만 컴파일러에서 그냥 허용해 주는것이다.
		//원래는 Ex_09StaticSample.f() 이렇게 사용해야 한다. 
		s2.f();
		//static 변수는 객체와 무관하게 공유하므로 s2 객체에서 변경 되어 있어도 s1에서 변경된 것과 동일하다. 
		System.out.println(s1.m);
		//System.out.println(s2.n);
		
		

	}

}
