import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private int deckPointer = 0;
	
	public Deck() {
		for (int i = 0; i <= 5; i++) {
			for(int j = 2 ; j <= 14; j++) {
				cards.add(new Card(j, "heart",  i+1));
				cards.add(new Card(j, "spade",  i+1));
				cards.add(new Card(j, "club",   i+1));
				cards.add(new Card(j, "diamond",i+1));
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int getDeckPointer() {
		return deckPointer;
	}

	public void setDeckPointer(int deckPointer) {
		this.deckPointer = deckPointer;
	}

}
