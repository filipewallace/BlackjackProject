package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cardDeck;

	public Deck() {

		cardDeck = new ArrayList<>(52);
		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				Card nextCard = new Card(s, r);
				cardDeck.add(nextCard);
			}
		}
	}

	public int checkDeckSize() {
		return this.cardDeck.size();
	}

	public Card dealCard() {
		return this.cardDeck.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(this.cardDeck);
	}
}