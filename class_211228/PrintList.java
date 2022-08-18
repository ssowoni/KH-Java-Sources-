package class_211228;

import java.util.List;

public class PrintList {
	//<?> 제네릭 내부 변수 타입을 ?로 활용, 어떤 변수든 다 받아들이겠다는 뜻
	//제너릭 타입이 ? 인 것을 와일드카드 라고 한다.
	public static void printList(List<?> list) {
		//확장 for문을 활용해 저장된 성분 출력
		//★확장 for문 이용해서 출력하는 거 한 번 더 봐보자.
		for(Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
	
	public static void addNumbers(List<? super Integer> list) {
		for(int i = 1; i<=10; i++) {
			list.add(i);
		}
	}
	
}
