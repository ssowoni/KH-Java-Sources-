package class_211222;
//바인딩의 중요성
//객체 생성자를 호출하면 상속 받는 클래스의 경우 부모 클래스의 상속자를 우선 호출해야함
//그래서 계속 상위 클래스 생성자로 실행이 미뤄짐
//결국 최상위 부모 클래스인 E03A의 생성자가 가장 먼저 실행되고
//그 이후 E03B E03C 순서대로 실행된다. 

class E03A{
		//생성자
		public E03A() {
			System.out.println("생성자 A");
		}
	}

class E03B extends E03A {
		public E03B() {
			System.out.println("생성자 B");
		}
	}
	
	class E03C extends E03B{
		public E03C() {
			System.out.println("생성자 C");
		}
	}

	public class Ex_05{
		public static void main(String[] args) {
			//여기서 객체 변수 c는 선언하지 않아도 된다.
			//그냥 new E03C()만 써도 정상 작동
			E03C c;
			c = new E03C();
		}
	}
	


