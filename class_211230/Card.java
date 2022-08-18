package class_211230;

public class Card {
	//Card(suit[i], number[j]) 인자로 받은 값을 
	//생성자(매개변수로) 생성
	String suit;
	String number;
	
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	//Card 객체에 저장된 데이터를 표현하기 위해 toString 메소드를 활용
	@Override 
	public String toString() {
		return "(" + suit + " " +number +")";
	}
}
