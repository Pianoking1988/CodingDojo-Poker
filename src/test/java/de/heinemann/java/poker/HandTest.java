package de.heinemann.java.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HandTest {

	@Test
	public void highCardWithFiveCards() {
		Hand hand = new Hand(new Cards("2s 5h 7d Ts Qc"));
		assertEquals(Rank.HIGH_CARD, hand.getRank());
		assertCards(new Cards("Qc Ts 7d 5h 2s"), hand.getHandCards());
	}

	@Test
	public void highCardWithSevenCards() {
		Hand hand = new Hand(new Cards("2s Kd 3c 8h Tc Ac 4h"));
		assertEquals(Rank.HIGH_CARD, hand.getRank());
		assertCards(new Cards("Ac Kd Tc 8h 4h"), hand.getHandCards());
	}
	
	private void assertCards(Cards expected, Cards actual) {
		assertEquals(expected.toString(), actual.toString());
	}

}
