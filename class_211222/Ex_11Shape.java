package class_211222;

public class Ex_11Shape {
	
	protected String name;
	public void paint() {
		//이부분에서 동적 바인딩이 발생해 @Override 하고 있는 draw 메소드로 이동 (3)
		//오버라이드는 후손 클래스가 상속받은 부모 메소드를 재작성 하는 것
		//즉) 부모가 제공하는 기능을 후손이 일부 고쳐  사용하겠다!! 후손에서만 사용 가능.
		//그 후 후손 객체를 통한 실행 시 후손 것이 우선권을 가진다(동적바인딩)
		draw();
	}
	
	//이동해서 이전에 전달받은 name을 호출하고 (6)
	public void draw() {
		System.out.println(name);
	}

}
