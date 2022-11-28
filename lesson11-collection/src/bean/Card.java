package bean;

import java.util.ArrayList;
import java.util.List;

public class Card {
	Chat type;
	NumberOfCard num;
	

	public static List<Card> getCards(){
		List<Card> list = new ArrayList<>();
		for (Chat chat : Chat.values()) {
			for (NumberOfCard numberOfCard : NumberOfCard.values()) {
				list.add(new Card(chat, numberOfCard));
			}
			
		}
		return list;
	}

	

	public Chat getType() {
		return type;
	}






	public Card(Chat type, NumberOfCard num) {
		super();
		this.type = type;
		this.num = num;
	}






	public void setType(Chat type) {
		this.type = type;
	}






	public NumberOfCard getNum() {
		return num;
	}






	public void setNum(NumberOfCard num) {
		this.num = num;
	}






	@Override
	public String toString() {
		return  num + ":" + type ;
	}
}
