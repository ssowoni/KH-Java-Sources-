package class_211229;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex_06_Iterator2 {

	public static void main(String[] args) {
		//ArrayList 객체에 데이터를 저장하고
		ArrayList<String> al = new ArrayList<>();
		al.add("구렁이");
		al.add("팔렁이");
		al.add("칠렁이");
		al.add("구렁이");
		al.add("구렁삼");
		al.add("구렁사");
		//Iterator 객체를 활용해 ArrayList 변수의 데이터를 순서대로 출력
		//일반 for문
		for(int j= 0; j<al.size(); j++ ) {
			System.out.println(al.get(j));
		}
		System.out.println();
		//확장 for문
		for( String arr :al) {
			System.out.println(arr);
		}
		
		System.out.println(al);
		System.out.println("======================");
			
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("====================== ");
		
		//LinkedList 변수도 ArrayList와 마찬가지로 컨트롤이 가능하다.
		LinkedList<String> kk = new LinkedList<>();
		String[] animal = {"산토끼", "집토끼", "판토끼", "죽은토끼", "알카리토끼"};
		for(int i = 0; i < animal.length; i++) {
			kk.add(animal[i]);
		}
		
		Iterator<String> that = kk.iterator();
		while(that.hasNext()) {
			System.out.println(that.next());
		
	}
		//객체명을 sysout 값에 넣으면 배열처럼 출력된다.
		//원래 객체를 print값으로 넣으면 문자열 즉 주소값이 출력되는데
		//대부분의 컬렉션은 모든 원소에 대해서 .toString() 메소드를 사용해서 보기 좋은 출력을 생성할 수 있습니다.
		System.out.println(al);
		System.out.println(kk);
		

}
}