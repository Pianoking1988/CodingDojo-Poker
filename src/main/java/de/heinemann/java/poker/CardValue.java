package de.heinemann.java.poker;

import org.apache.commons.lang3.ArrayUtils;

public enum CardValue {
	
	TWO ("2"),
	THREE ("3"),
	FOUR ("4"),
	FIVE ("5"),
	SIX ("6"),
	SEVEN ("7"),
	EIGHT ("8"),
	NINE ("9"),
	TEN ("T", "10"),
	JACK ("J"),
	QUEEN ("Q"),
	KING ("K"),
	ACE ("A");

	private String[] aliases;

	private CardValue(String... aliases) {
		this.aliases = aliases;
	}

	private boolean representedBy(String valueRepresentation) {
		return ArrayUtils.contains(aliases, valueRepresentation.toUpperCase());
	}

	public String getRepresentation() {
		return aliases[0];
	}
	
	public static CardValue parse(String valueRepresentation) {
		for (CardValue cardValue : values()) {
			if (cardValue.representedBy(valueRepresentation)) {
				return cardValue;
			}
		}
		throw new IllegalArgumentException("'" + valueRepresentation + "' cannot be parsed to a CardValue");
	}
	
}
