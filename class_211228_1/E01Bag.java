package class_211228_1;

public class E01Bag<T> {
	private T thing;
	
	public E01Bag(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
	
}
class Book{//Book 클래스 생성
	
}
class PencilCase{//PencilCase 클래스 생성

}
class NoteBook{//Notebook 클래스 생성
}




	
