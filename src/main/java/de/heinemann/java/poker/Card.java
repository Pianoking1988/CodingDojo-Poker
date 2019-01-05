package de.heinemann.java.poker;

import org.apache.commons.lang3.StringUtils;

public class Card {

	private CardValue value;
	private CardSuit suit;

	public Card(CardValue value, CardSuit suit) {
		this.value = value;
		this.suit = suit;
	}

	public Card(String cardRepresentation) {
		parse(cardRepresentation);
	}
	
	public Card parse(String cardRepresentation) {
		this.value = CardValue.parse(StringUtils.substring(cardRepresentation, 0, -1));
		this.suit = CardSuit.parse(StringUtils.substring(cardRepresentation, -1));
		return this;
	}
	
	@Override
	public String toString() {
		return value.getRepresentation() + suit.getRepresentation();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}	

}
