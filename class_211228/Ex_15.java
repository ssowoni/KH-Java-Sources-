//오늘의 과제 
package class_211228;
public class Ex_15 {
	public static void main(String[] args) {
		//Goods의 객체인 Apple을 제네릭 파라미터에 넣고
		//goods1.set(new Apple()); set값으로 받았기에 클래스 생성
		Goods<Apple> goods1 = new Goods<Apple>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		//System.out.println(apple);
		System.out.println("사과");
		
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		System.out.println("연필");
		
		Goods<Apple> goods3 = new Goods<Apple>();
		goods3.set(new Apple());
		//Pencil pen = goods3.get(); //syntax 에러 
		
		
	}
}
//하나의 클래스로 모든 타입을 담을 수 있어야한다.
//강한 타입 체크(문법오류) 필요
//즉, 제네릭의 기본 개념은 클래스 내에 사용되는 타입을 클래스의 정의때가 아닌
//객체 생성 때 정의하겠다는 의미 
