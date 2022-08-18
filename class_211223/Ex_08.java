//에러코드!!!!! toString으로 오버로딩 해주는 것과
//Point1 클래스 명과 객체 생성할 때 Point 클래스명 다르게 입력했다 ㅠㅠㅠ
package class_211223;

class Point1{
	private int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
		
		
	}
	@Override
	public String toString() {
		return "x= " + x + " y= " + y;
		//return x + y;
	}
	
		
}
//Overriding을 통해 객체 정보를 재정의 해줄 수 있다.
//이때 리턴 타입을 String 대문자로 써야 한다.
//이것을 랩퍼 클래스라고 한다. 

//Object 클래스
//모든 클래스의 최상위(부모) 클래스
//선언한 필요 없이 모든 클래스에 강제 상속돼있다.

public class Ex_08 {

	public static void main(String[] args) {
		Point1 p = new Point1(2,3);
		//toString 메소드 : 객체의 정보를 문자열로 표현하는 클래스
		
		
		System.out.println(p.toString());
		//p는 p.toString()으로 자동 변환되며 toString은 자동 overriding
		System.out.println(p);
		//p.toString() + "입니다"로 자동 변환
		System.out.println(p + "입니다");
		
		
	}
	

}
