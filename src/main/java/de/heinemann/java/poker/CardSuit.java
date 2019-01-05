package de.heinemann.java.poker;

public enum CardSuit {

	CLUBS ("c"),
	DIAMONDS ("d"),
	HEARTS ("h"),
	SPADES ("s");
	
	private String representation;

	private CardSuit(String representation) {
		this.representation = representation;
	}
	
	private boolean representedBy(String suitRepresentation) {
		return representation.equalsIgnoreCase(suitRepresentation);
	}
	
	public String getRepresentation() {
		return representation;
	}

	public static CardSuit parse(String suitRepresentation) {
		for (CardSuit cardSuit : values()) {
			if (cardSuit.representedBy(suitRepresentation)) {
				return cardSuit;
			}
		}
		throw new IllegalArgumentException("'" + suitRepresentation + "' cannot be parsed to a CardSuit");
	}
	
}
