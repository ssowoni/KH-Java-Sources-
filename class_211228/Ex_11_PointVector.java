//난이도 하, 기본으로 잡고 가자 이거 먼저!
package class_211228;
import java.util.Vector;

public class Ex_11_PointVector {

	public static void main(String[] args) {
		//Point객체를 요소로 가지는 벡터 생성
		//객체를 요소로 가진다. 즉) Point 클래스에 Point 생성자를 만들어 주면 되는 것.
		Vector<Point> v = new Vector<Point>();
		//Point 클래스 타입에 있는 x, y 변수값을 입력한다.
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1);
		//1번요소 -5, 20을 삭제한다.
		
		for(int i =0; i<v.size(); i++) {
			//저장정보 출력
			Point p = v.get(i);
			//객체 자체를 println에 넣으면 toString 메소드가 자동 실행된다.
			System.out.println(p);
		}
		
	}

}
