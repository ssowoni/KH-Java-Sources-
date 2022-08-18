//구렁이의 확장for문을 iterator로 바꿔봐라! 
//오늘 iterator 완벽히 숙지하기.! 
package class_211229;
import java.util.Iterator;
import java.util.Vector;

public class Ex_05_IteratorEx {
	//Iterator : 자료형 객체 변수 내부 데이터를 편하게 활용하기 위해 만들어진 클래스
	//객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)
	//hashNext(), next(), remove() 세 가지 메소드를 가지고 있다.

	public static void main(String[] args) {
		
		//선언과 동시에 생성 v 는 참조 변수 
		Vector<Integer> v = new Vector<Integer>();
		//정수값을 다루는 제네릭 생성 
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		//사용 방법은 자료구조형 객체 변수를 Iterator 변수에 대입하고
		//대입 받아 만들어진 Iterator 객체 변수에 메소드를 입력해 실행하는 방식이다.
		Iterator<Integer> it = v.iterator();
		
		//hashNext 방문할 요소가 남아있으면 true 리턴
		//즉) for문 대신이라 생각하면 된다.
		while(it.hasNext()) {
			//next는 다음 요소 리턴한다.
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡테에 있는 정수 합: " + sum);

	}
}
