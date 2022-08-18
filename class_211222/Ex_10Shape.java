//여기서 부터 오버라이딩! 
package class_211222;

public class Ex_10Shape {
	protected String name;
	//해당 메소드에서
	public void paint() {
		//draw 메소드를 만나는데 부모와 자식 모두에 같은 이름의 메소드가 존재한다.
		//동적 바인딩 상태에서는 자식 클래스를 활용하게 된다. 
		draw();
	}
	public void draw() {
		System.out.println("Shape");
	}
}
