package class_211230;

import java.util.HashMap;

public class Ex_04_HashMap {

	public static void main(String[] args) {
		
		//Map의 키는 set으로 만들어졌기 때문에 중복이 불가능하다.
		//value는 collection으로 중복이 가능하다, 둘 다 순서는 없다.
		HashMap<String, String> hm = new HashMap<>();
		hm.put("배수지", "010-333-4444");
		hm.put("강수지", "010-111-2222");
		hm.put("이효리", "010-666-5555");
		System.out.println("강수지 전화번호: "  + hm.get("강수지"));
		System.out.println("배수지 전화번호: "  + hm.get("배수지"));
		System.out.println("이효리 전화번호: "  + hm.get("이효리"));
		//키값으로 검색한다.
		

	}

}
