package class_211209;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 커피 드릴까요?");
		String order = sc.next();
		int price = 0;
		switch(order) {
		case "에스프레소":
			//break가 없기 때문에 빠져나가지 않고 밑으로 내려간다.
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;//결국 에스프레소, 카푸치노, 카페라떼 모두 3,500원이라는 뜻
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다!");
		
		}
		
		if(price !=0) //price=0이면 선택된 메뉴가 없다는 뜻, 중복 출력 방지
			//0이 아니다는 말은 가격이 정해져 있다는 뜻
			System.out.println(order+"는"+price+"원 입니다.");
		sc.close();

	}

}
