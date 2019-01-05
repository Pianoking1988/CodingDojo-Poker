package de.heinemann.java.poker;

public class Hand {

	private Cards cards;
	
	private Rank rank = Rank.HIGH_CARD;
	private Cards handCards = new Cards();

	public Hand(Cards cards) {
		this.cards = new Cards(cards);
		evaluateRank();
	}

	private void evaluateRank() {
		
		
	}

	public Rank getRank() {
		return rank;
	}

	public Cards getHandCards() {
		return handCards;
	}
	
}
