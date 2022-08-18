package class_211230;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex_02_HashSet {

	public static void main(String[] args) {
		//HashSet : Set 인터페이스를 상속받는 클래스
		//저장 데이터의 중복을 허용하지 않고 null은 하나만 허용함
		//(이 또함 중복을 허용하지 않는다는 뜻)
		//데이터 크기가 가변
		//해당 객체 요소의 출력도 Iterator 클래스의 도움을 필요로 한다.
		//Set은 객체를 중복해서 저장할 수 없고 하나의 null값만 저장할 수 있다. 또한 저장 순서가 유지되지 않는다.
		//만약 요소의 저장 순서를 유지해야 한다면 LinkedHashSet 클래스를 사용하면 된다.

		
		HashSet<String> set = new HashSet<String>();
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		System.out.println(set);
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//TreeSet: HashSet과 유사하며 트리구조로 돼있어 데이터 검색 기능이 더 좋은 편
		//Set인터페이스를 구현한 클래스로는 HashSet과 TreeSet이 있는데 HashSet의 경우 정렬을 해주지 않고 
		//TreeSet의 경우 자동정렬을 해준다는 차이가 있다.

		TreeSet<String> st = new TreeSet<String>();
		st.add("Milk");
		st.add("Bread");
		st.add("Butter");
		st.add("Cheese");
		st.add("Ham");
		System.out.println(st);

	}

}
