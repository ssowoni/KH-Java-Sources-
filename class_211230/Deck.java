package class_211230;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	//ArrayList에 제네릭 파라미터 값을 Card로 받고있기에 
	//Card 클래스 생성해야한다.
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = {"CLUB", "DIAMOND", "HEART", "SPACE"};
	String[] number = {"2", "3", "4", "5","6","7", "8", "9", "10","J","Q", "K"};
	
	public Deck() {
		for(int i=0; i<suit.length;i++)
			for(int j=0; j<number.length;j++)
				//deck 객체에 add로 new Card(인자)를 입력했기에  
				//Card 생성자 만들어서 매개변수로 받아줘야한다. 
				deck.add(new Card(suit[i], number[j]));
		
	}
	public void shuffle() {
		//Collections.shuffle : 저장된 데이터들을 랜덤으로 출력함
		Collections.shuffle(deck);
	}
	//deal 메소드를 살펴봤더니 Card를 반환한다. 
	//이 말은 즉슥 앞에 Player클래스 getCard 메소드에 
	//매개변수를 Card로 지정해줘야 한다는 것 
	public Card deal() {
		return deck.remove(0);
	}
	
}
