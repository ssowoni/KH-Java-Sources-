package class_211224;
//컬렉션 : 자바의 자료구조를 구현한 클래스
//배열과 유사한 다양한 배열 타입을 제공함
//Vector, HashMap, HashSet, Enumeration, ArrayList 등 어마어마하다
//일일이 다 이해하긴 어렵고 나올 때 마다 객체 특성을 찾아서 하면 된다. 

import java.util.ArrayList;

public class Ex_9_13 {

	public static void main(String[] args) {
		//ArrayList 객체
		//<> 꺽쇠(제너릭, 다이아몬드 연산자)을 이용해 저장될 데이터의 자료형을 정할 수 있다.
		//꺽쇠 안쪽은 자료형 객체가 들어가야 하므로 랩퍼 클래쓰로 쓰여야 한다.
		ArrayList<String> al = new ArrayList<String>();
		//add : ArrayList 객체에 데이터를 저장하는 메소드이다
		//ArrayList의 장점은 저장 순서대로 데이터가 출력된다는 점이다
		//그래서 가장 많이 쓰이는 편이다 
		al.add("구렁이");
		al.add("팔렁이");
		al.add("칠렁이");
		al.add("구렁이");
		al.add("구렁삼");
		al.add("구렁사");
		
		//일반 for문 
		for(int i = 0 ; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//al.add("구렁구렁");
		al.set(1,"구렁구렁");
		//확장 for문 
		System.out.println("===============");
		for(String str : al)
			System.out.println(str);

	}

}
