//다시 이해해보기 
//동적바인딩 상태에서는 같은 메소드가 있을 때 자식 메소드를 활용한다
package class_211222;
public class Ex_10 extends Ex_10Shape {
	//Ex_10은 자식 Ex_10Shape 부모
	@Override
	public void draw() {
		//그래서 이부분이 출력된다.
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		//★업 캐스팅의 기본형 부모클래스 객체명 = new 자식생성자();
		//자식 객체가 부모 멤버를 활용할 때 사용
		//이렇게 되면 메소드는 자식의 생성자를 활용하고 필드는 부모의 필드만 활용
		Ex_10Shape b = new Ex_10();
		//paint로 이동
		b.paint();
	}

}
