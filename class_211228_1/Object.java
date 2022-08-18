package class_211228_1;

public class Object {
	//Bag 생성자의 매개변수 타입을 Object로 선언했기에 Bag 객체 생성하면서 어떤 객체 타입도 전달하여 생성 가능
			//리턴 타입이 Object이기 때문에 메소드에서 반환하는 타입이 Object이면 사용하기 전에
			//원래 타입으로 변경해야 한다 그렇지 않으면 Object에서 상속한 메소드만 사용 가능하다
	public static void main(String[] args) {
			E01Bag bag = new E01Bag(new Book());
			E01Bag bag1 = new E01Bag(new PencilCase());
			E01Bag bag2 = new E01Bag(new NoteBook());
			
			//제너릭을 사용하지 않고 모두 Object 타입을 활용했기에
			//현재 bag 객체는 모두 Object 타입이 된다
			//그러므로 변수 입력을 위해 모두 형 변환을 해줘야 한다.
			Book book = (Book)bag.getThing();
			//Book 타입의 book은 Book 정보가 들어있는 bag에서 Thing을 쓴다.
			PencilCase pc = (PencilCase)bag1.getThing();
			//PencilCase 타입의 pc은 PencilCase 정보가 들어있는 bag1에서 Thing을 쓴다.
			NoteBook nb = (NoteBook)bag2.getThing();
			//NoteBook 타입의 nb은 NoteBook 정보가 들어있는 bag2에서 Thing을 쓴다.
			
			/*
			 * 제너릭일 경우 Bag<Book> bag = new Bag<>(new Book()); 
			 * Bag<PencilCase> bag1 = new Bag<> (new PencilCase()); 
			 * Bag<NoteBook> bag2 = new Bag<>(new NoteBook());
			 * 
			 * Book book = bag.getThing(); 
			 * PencilCase pc = bag1. getThing(); 
			 * NoteBook nb = bag2.getThing();
			 * 
			 * bag = bag2; //둘의 타입이 Bag 타입으로 오류는 발생하지 않지만 의미상 Book을 가지는 bag 과 NoteBook을 가진
			 * bag2가 같다는 것이므러 잘못된 코드
			 */
			bag.showType();
			bag1.showType();
			bag2.showType();
			
			

		}
}

	