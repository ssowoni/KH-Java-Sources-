package class_211228;
import java.util.ArrayList;

public class Ex_09_ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("watermelon"); //add(stirng) 문자열 추가/수정
		al.add("apple");
		al.add("banana");
		al.add("watermelon"); 
		al.add("Jujube");
		al.add("banana");
		//size메소드를 활용하면 ArrayList 변수에 저장된 데이터 수를 알 수 있음
		System.out.println("Count: " + al.size());
		print(al);
		//앞 번호 순서에 저장된 데이터 정보 변경
		//1번 자리(즉 2번째 출력 값, 값의 index는 0부터 시작하기에)에 "kiwi" 추가한다. 
		al.add(1, "kiwi");
		print(al);
		al.add(4, "peach");
		print(al);
		//remove 메소드로 해당번째 저장된 데이터 제거
		al.remove(0);
		print(al);
		
		//3번째 배열의 값이 변함을 표시, 3번 자리에 어떤 값이 들었나 출력한다. 
		System.out.println("Index 3 : " + al.get(3));
		//contains : 해당 자료형 변수에 문자(열)가 저장돼있는지 여부를 확인
		System.out.println("Banana : " +al.contains("banana"));
		//바나나의 위치 
		System.out.println("Banana : " +al.indexOf("banana"));
		//바나나의 마지막 위치
		System.out.println("Banana : " +al.lastIndexOf("banana"));
		
		for(int i=0; i<al.size();i++) {
			if(al.get(i).equals("banana")) {
				al.set(i, "strawberry");
			}
		}
		
			print(al);
	}
	
	//static 메소드로 코딩 순서와 무관하게 항상 메모리가 할당된 상태이다. 
	private static void print(ArrayList<String> al) {
		//확장 for문을 활용해서 저장된 데이터를 출력
		for(String str:al)
			System.out.print(str + "\t");
		System.out.println();
	}

}
