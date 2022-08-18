package class_211228;

class Bag<T> {
	//클래스 이름 다음에 <T>를 지정하여 Bag를 제너릭 클래스로 선언한다.
	//Bag 선언된 모든 T는 인스턴스 생성 시 전달되는 타입으로 대체한다.
	//타입 매개변수로 전달되는 값을 타입 인자라고 한다.
	private T thing;
	//Bag<T> 클래스 내에서만 사용할 수 있게 지정
	public Bag(T thing) {
		this.thing = thing;
	}
	//thing은 Bag의 thing에 저장된다.
	public T getThing() {
		return thing;
	}
	
	//T를 Thing에서 가져오면 thing을 되돌려줌
	public void setThing (T thing) {
		this.thing= thing;
	}
	//Thing의 값을 내보낸다.
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}//thing에 저장된 타입을 보여줌 (getClass().getName()은 thing타입을 추출하는 메소드)
	
}
class Book{//Book 클래스 생성
	
}
class PencilCase{//PencilCase 클래스 생성

}
class Notebook{//Notebook 클래스 생성
}


public class Ex_06_BagTest{
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book()); // 생략됨
		//Bag<Book> bag은 제너릭 타입으로 Book을 포함하는 Bag 객체를 참조하는 변수
		//(new Book())은 Bag 클래스의 인스턴스(객체)를 생성하면서 Book을 생성한 후 인자로 전달
		
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		//Bag<PencilCase> bag2는 제너릭 타입으로 PencilCase를 포함하는 Bag 객체를 참조하는 변수
		//(new PencilCase())은 Bag 클래스의 인스턴스를 생성하면서 Notebook을 생성한 후 인자로 전달
		
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		//Bag<Notebook> bag3는 제너릭 타입으로 Notebook을 포함하는 Bag 객체를 참조하는 변수
		//(new Notebook())은 Bag 클래스의 인스턴스를 생성하면서 Notebook을 생성한 후 인자로 전달
		
		bag.showType(); // bag은 Book의 타입을 보여줌
		bag2.showType(); //bag2는 PencilCase의 타입을 보여줌
		bag3.showType();// bag3는 Notebook의 타입을 보여줌
		
		//bag =bag2;
		
		
	}
}



