package class_211230;

import java.util.HashSet;
import java.util.Set;

public class Ex_03_Set {

	public static void main(String[] args) {
		
		//값을 추가하거나 삭제할 때는 내가 추가 혹은 삭제하고자 하는 값이 
		//Set내부에 있는지 검색한 뒤 추가나 삭제해야 하므로 List구조에 비해 속도가 느리다. 
		//그러나 Set의 가장 큰 장점은 중복을 자동으로 제거해준다는 점!! 
		//HashSet<String> s = new HashSet<String>(); 
		Set<String> s = new HashSet<String>(); 
		String[] sample = {"단어", "중복", "구절", "중복"};
		for(String a : sample)
			if(!s.add(a))//중복으로 인해 HashSet에 저장되지 않은 데이터를 확인하는 방법
				System.out.println("중복된 단어 : [" + a+ "]");
		System.out.println(s.size() + " 중복되지 않은 단어: " + s);
		
		}

	}


