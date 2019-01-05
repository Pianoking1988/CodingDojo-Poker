package de.heinemann.java.poker;

import static org.junit.jupiter.api.Assertions.*;
import static de.heinemann.java.poker.CardValue.*;
import static de.heinemann.java.poker.CardSuit.*;

import org.junit.jupiter.api.Test;

public class CardsTest {

	@Test
	public void parseSingleCard() {
		Cards cards = new Cards("2c");
		assertTrue(cards.contains(new Card(TWO, CLUBS)));
		assertEquals(1, cards.size());
	}
	
	@Test
	public void parseSingleCardWrongCase() {
		Cards cards = new Cards("kD");
		assertTrue(cards.contains(new Card(KING, DIAMONDS)));
		assertEquals(1, cards.size());
	}

	@Test
	public void parseTenAsNumber() {
		Cards cards = new Cards("10s");
		assertTrue(cards.contains(new Card(TEN, SPADES)));
		assertEquals(1, cards.size());
	}

	@Test
	public void parseTenAsCharacter() {
		Cards cards = new Cards("Ts");
		assertTrue(cards.contains(new Card(TEN, SPADES)));
		assertEquals(1, cards.size());
	}

	@Test
	public void parseTwoCards() {
		Cards cards = new Cards("As 5h");
		assertTrue(cards.contains(new Card(ACE, SPADES)));
		assertTrue(cards.contains(new Card(FIVE, HEARTS)));
		assertEquals(2, cards.size());
	}

	

}
