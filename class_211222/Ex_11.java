package class_211222;

	public class Ex_11 extends Ex_11Shape{
	protected String name;
	@Override
	//해당 메소드가 호출되어 데이터를 입력함(4)
	
	public void draw() {
	name = "Circle";
	//super. = 상속을 통한 자식 클래스를 정의 시 해당 자식 클래스의 부모 객체를 가리킨다.
	super.name = "Shape";
	//super.name을 활용해 부모 클래스에 이름 입력
	//super 키워드를 통해 다시 부모 클래스의 draw로 이동(5)
	//여기에서 Shape이 출력된다.
	super.draw();
	//다시 자식 클래스로 이동해 Circle를 출력하고 종료 (7)
	System.out.println(name);
	}
	
	public static void main(String[] args) {
		//업캐스팅 객체 생성 (1)
		//업 캐스팅의 기본형 부모클래스 객체명 = new 자식생성자();
		Ex_11Shape b = new Ex_11();
		//부모 클래스 Shape의 paint 메소드 호출 (2)
		b.paint();

	}

}
//Super는 슈퍼 클래스의 멤버를 접근할 때 사용되는 레퍼런스
//★서브 클래스에서만 사용
//슈퍼 클래스의 메소드 호출
//컴파일러는 super의 접근을 정적 바인딩으로 처리 
	
//동적바인딩은 실행할 메소드 실행시 (run time)에 결정
//오버라이딩 메소드가 항상 호출 