//인자도 new를 통해서 만들 수 있다. 
package class_211229;

public class Ex_02_BagTest {

	public static void main(String[] args) {
		//E01Bag<Book> bag은 제네릭 타입으로 Book을 포함하는 Bag 객체를 참조하는 변수
		//(new Book())은 Bag 클래스의 인스턴스를 생성하면서 Book을 생성한 후 인자로 전달
		//Ex_02Bag 클래스와 Book 클래스를 만들어야한다. 
		Ex_02Bag<Book> bag = new Ex_02Bag<Book>(new Book());
		
		//Ex_02Bag 클래스와 PencilCase 클래스를 만들어야한다. 
		Ex_02Bag<PencilCase> bag2 = new Ex_02Bag<>(new PencilCase());
		
		bag.setOwner("김자바");
		bag2.setOwner("김샘이");
		
		//Owner가 김자바로 저장된 bag을 불러온다.
		//Ower가 김자바로 저장된 bag2를 불러온다.
		
		//boolean형의 값을 반환하는 bag 객체 클래스의 inSameOwner 메소드에 인자값에 bag2를 넣는다.
		//리턴타입 변수 = 객체명.<구체적인 타입> 메소드명(매개값);
		boolean result = bag.isSameOwner(bag2);
		
		//bag과 bag2 객체의 타입 매개변수가 다르기 때문에 오류 발생, isSameOwner() 메소드에서
		//구현하고 싶은 것은 물품 소유주가 같은지를 비교하여 같으면 true, 다르면 false를 반환하는 것이므로
		//매개변수가 같을 필요는 없다. 
		//이 때 와일드 카드를 사용한다.
		if(result)System.out.println("소유자가 동일합니다.");
		else System.out.println("소유자가 다릅니다.");
		
		
		//Ex_02Bag<Water> bag4 = new Ex_02Bag<Water>(new Water());	
		//Ex_02Bag<Coffee> bag5 = new Ex_02Bag<Coffee>(new Coffee());
		//Solid로 상속되지 않은 Water와 Coffee타입은 인자로 사용 불가하다.
		//public class Ex_02Bag<T extends Solid>에 의해 Solid의 하위 클래스만 활용 가능한 것! 
		//
	
	}

}
