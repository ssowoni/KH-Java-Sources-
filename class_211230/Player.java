package class_211230;

import java.util.ArrayList;
import java.util.List;

public class Player{
	//ArrayList 사용해서 만들기
	//
	ArrayList<Card> list = new ArrayList<Card>();
	private Card card;
	
	public void getCard(Card card) {
		list.add(card);
	}
	
	public void showCards() {
		System.out.println(list);
	}

//	public Card getCard() {
//		return card;
//	}
//
//	public void setCard(Card card) {
//		this.card = card;
//	}


	
	
	//private char[] card;
//	public void getCard() {
//		
//	}
	
//	public void getCard(Card card) {
//		//return a.add(card); 
//		a.add(card);
//	}
	
	
}
