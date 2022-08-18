package class_211229;
//같다는 == , equalse , compare 이 3개를 비교하자.! 

class Solid{}
class Liquid{}
class Book extends Solid{}
class PencilCase extends Solid{}
class NoteBkki extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}



public class Ex_02Bag<T extends Solid> {
	//Bag 클래스를 고체 매개변수만 상속받을 수 있도록 제한
	//T는 Solid나 Solid를 상속받는 하위 객체로만 대체
	 private T thing;
	 private String owner;
	//Ex_02Bag을 호출한 즉, Ex_02Bag 인자에 들어 있는 값들은 new 클래스!
	public Ex_02Bag(T thing){
		this.thing = thing;
		
	}
	public T getThing() {
		return thing;
	}
	//thing.getClass().getName() 거꾸로 쓰면 안된다. 
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
	
	public String getOwner() {
		return owner;
	}
	//따라서 setOwner은 string 타입으로 지정해준다.! 
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//boolean isSameOwner(Ex_02Bag<2> obj)
	//메소드 호출: boolean result = bag.isSameOwner(bag2);
	//구현하고 싶은 것은 물품 소유주가 같은지를 비교하여 같으면 true, 다르면 false를 반환하는 것이므로
	//매개변수가 같을 필요는 없다. 이때 와일드카드를 사용한다.
	////↓메소드 구현 
	boolean isSameOwner(Ex_02Bag<?> obj) {
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}

}



