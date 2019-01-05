package de.heinemann.java.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class Cards {

	private List<Card> cards = new ArrayList<>();

	public Cards() {}

	public Cards(String cardsString) {
		parse(cardsString);
	}
	
	public Cards(Cards cards) {
		for (Card card : cards.get()) {
			add(card);
		}
	}

	public Cards parse(String cardRepresentations) {
		String[] cardsRepresentations = cardRepresentations.split(" ");
		for (String cardRepresentation : cardsRepresentations) {
			add(new Card(cardRepresentation));
		}
		return this;
	}
	
	private Cards add(Card card) {
		cards.add(card);
		return this;		
	}

	public Iterable<Card> get() {
		return cards;
	}
	
	public boolean contains(Card card) {
		return cards.contains(card);
	}

	public int size() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		return StringUtils.join(
				cards.stream().map(card -> card.toString()).collect(Collectors.toList()),
				" ");
	}

}
