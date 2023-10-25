package classes;

import java.util.List;

public class PlayerHand {
	private List<Card> hand;
	
	public List<Card> getPlayerHand() {
		return this.hand;
	}
	
	public void add(Card card) {
		this.hand.add(card);
	}
	public PlayerHand(List<Card> cards) {
		this.hand=cards;
	}
	public void remove(Card card) {
		this.remove(card);
	}
	
}
