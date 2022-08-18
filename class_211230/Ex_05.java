//Product ArrayList 클래스 만들고
//원래 Ex_05를 TEST로 적어주셨다. 이거 잡아냈다.
package class_211230;

import java.util.ArrayList;
import java.util.List;

public class Ex_05 {
	//ArrayList 객체를 List로 형을 맞추고
	//와일드카드를 활용해 저장된 요소들의 객체 정보를 맞춤
	//class TEST{
	public void getProductText_Set(List<?>list) {
		//데이터를 저장할 때 객체와 객체의 변수들을 생성한다.
		//String은 null로 int는 0으로 초기화
		Product_ArrayList prod = null;
		String code = null; 
		String name = null;
		String color= null;
		int qty = 0;
		
		for(int i =0; i<list.size(); i++) {
			//전송받은 list 객체는 List 타입이므로 형변환이 필요
			prod = (Product_ArrayList) list.get(i);
			//형변환 후 내부에 저장된 변수들도 형변환해 데이터 획득
			code = (String) prod.getCode();
			name = (String) prod.getName();
			color= (String) prod.getColor();
			qty = (int) prod.getQty();
			
			System.out.println("제품번호 = " +code);
			System.out.println("제품이름 = " + name);
			System.out.println("제품색상 = " + color);
			System.out.println("제품수량 = " + qty);
			System.out.println();
		}
	}
//}
	


	public static void main(String[] args) {
		ArrayList pList = new ArrayList();
		//Product_ArrayList 객체에 생성자를 통해 데이터 입력(제네릭을 활용해 두가지 타입 변수를 저장함)
		Product_ArrayList p1 = new Product_ArrayList("0001", "스마트폰", "블랙", 100);
		Product_ArrayList p2 = new Product_ArrayList("0002", "스마트 TV", "흰색", 200);
		Product_ArrayList p3 = new Product_ArrayList("0003", "노트북", "은색", 100);
		//생성된 객체 정보를 ArrayList 변수에 저장함
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		//Ex_05 클래스 객체 p를 생성해 getProductTest_Set 메소드 실행
		//System.out.println(pList);
		//pList라는 객체가 들어가는데 이게 뭐를 가리키냐 바로 ArrayList에 저장된 값
		//따라서 와일드카드로 list 받는 것 
		Ex_05 p = new Ex_05();
		p.getProductText_Set(pList);
	
	}

}
