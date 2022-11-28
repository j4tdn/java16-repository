package bean;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String name;
	List<Card> cards;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
	
		return cards;
	}
	

	@Override
	public String toString() {
		return "name=" + name + "\n"  +"cards=" + cards + " \n";
	}

	public Player(String name,List<Card> cards) {
		super();
		this.name = name;
		this.cards = cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
