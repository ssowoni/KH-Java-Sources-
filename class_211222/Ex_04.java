package class_211222;
//상속성, 아주 중요
//출력과 관련된 것이 없으므로 출력은 없다
//만약 결과를 보고싶다면
//	public void showPoint() {
//System.out.println("(" + x + "," + y + ")");
//} 이런 식으로 출력 메소드를 별도로 만들어 주면 된다.! 

public class Ex_04 {

	public static void main(String[] args) {
		//자식 클래스인 Ex_04Student의 객체 생성
		Ex_04Student s = new Ex_04Student();
		s.set();
		//set 메소드를 활용해 Person에 있던 분수들을 갱신
		s.showPoint();
	}

}
