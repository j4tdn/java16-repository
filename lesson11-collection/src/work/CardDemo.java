package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import bean.Card;
import bean.Player;

public class CardDemo {
	public static void main(String[] args) {
		List<Card> cards = Card.getCards();
		System.out.println(cards);
		Random rd1 = new Random(4);
		
		List<Card> newcarddRandom = new ArrayList<>();
		for (int i = 0; i < cards.size();) {
		    newcarddRandom.add(cards.remove(rd1.nextInt(cards.size())));  
			
		}
		System.out.println(newcarddRandom.size());
		
		List<Player> players = new ArrayList<>();
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		
		
		for (int i = 0; i < players.size(); i++) {
			players.get( i ).setCards(newcarddRandom.subList(i * 13 , (i +1) * 13  ));
			System.out.println(players.get(i));	
		}
		//System.out.println(players);	
		
		
		
		
	}

}
