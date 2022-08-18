package class_211230;

import java.util.HashMap;
import java.util.Map;

public class Ex_08_03Map {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));
		//얘들의 value값은 Student 클래스에 값만 전달하는 역할
		//값은 조작이 가능하다.
		//★Student는 타입을 알 수 있기에 제네릭 사용하지 않고 만들 수 있다.
		System.out.println(st);
		
		st.remove("20090002");//금잔디 삭제
		st.put("20090003", new Student(20090003, "소이정"));
		System.out.println(st.get("20090003"));
		
		//확장 for문으로 데이터 획득 
		//Set<Map, Entry<K,V>> entrySet() 
		//모든 Map, Entry 객체를 set에 담아 리턴합니다.
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key= " + key + ", value =" +value);
		}
	}

	}

