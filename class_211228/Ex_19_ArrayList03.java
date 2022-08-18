package class_211228;

import java.util.ArrayList;

public class Ex_19_ArrayList03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		//1번 index에 Apple추가 bread랑 butter 밀림
		list.add(1, "Apple");
		//2번 값 대채
		list.set(2,"Grape");
		//3번값 삭제 즉) butter제거 
		list.remove(3);
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
