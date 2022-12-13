import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> cards = new ArrayList<Card>();
	private int handValue;
	
	public boolean anotherCardPlayer(Dealer dealer) {
		
		calcHandValue();
		if(dealer.getOpenCard().getValue() >= 7 && this.handValue <= 16) return true;
		else if (this.handValue <= 11) return true;
		else return false;
	}
	
	public void calcHandValue() {
		this.cards.forEach(Card -> handValue += Card.getValue());
	}
	
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int getHandValue() {
		return handValue;
	}

	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}
	
}
