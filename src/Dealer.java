import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dealer extends Player {
	
	private Card openCard;
	private Card closeCard;
	
	
	
	public void initGame() {
		
	}
	
	
	public Deck shuffle(Deck deck) {
		for (int i = 0; i <= 3; i++) {
			Collections.shuffle(deck.getCards());
		}
		return deck;
	}
	
	public Deck splitDeck(Deck deck) {
		Random rnd = new Random();
		int num = rnd.nextInt(15)+1;
		int upDown = rnd.nextInt(2);
		int median = deck.getCards().size() / 2;
		Deck actionDeck = new Deck();
		List<Card> actionCards = upDown > 0 ?  deck.getCards().subList(0, median + num) : deck.getCards().subList(0, median - num);
		actionDeck.setCards(actionCards);
		return actionDeck;
	}
	
	public void deal(Player player, Deck deck) {
		dealPlayerCard(player, deck);
		this.openCard = deck.getCards().get(deck.getDeckPointer());
		dealDealerCard(deck);
		dealPlayerCard(player, deck);
		this.closeCard = deck.getCards().get(deck.getDeckPointer());
		dealDealerCard(deck);
	}
	
	public void dealPlayerCard(Player player, Deck deck) {
		player.getCards().add(deck.getCards().get(deck.getDeckPointer()));
		deck.setDeckPointer(deck.getDeckPointer() + 1);
	}
	
	public void dealDealerCard(Deck deck) {
		this.getCards().add(deck.getCards().get(deck.getDeckPointer()));
		deck.setDeckPointer(deck.getDeckPointer() + 1);
	}
	
	public boolean anotherCard() {
		super.calcHandValue();
		return this.getHandValue() < 17 ? true : false;
	}


	public Card getOpenCard() {
		return openCard;
	}
	public void setOpenCard(Card openCard) {
		this.openCard = openCard;
	}
	public Card getCloseCard() {
		return closeCard;
	}
	public void setCloseCard(Card closeCard) {
		this.closeCard = closeCard;
	}

}
