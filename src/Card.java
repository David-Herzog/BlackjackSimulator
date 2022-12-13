
public class Card {

	private int nr;
	private String symbol;
	private int value;
	private int deckId;
	
	public Card(int nr, String symbol, int deckId) {
		this.nr = nr;
		this.symbol = symbol;
		this.deckId = deckId;
		this.value = nr > 10 ?  10 : nr;
	}
	
	public int getDeckId() {
		return deckId;
	}
	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
