package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cardsDeck = new ArrayList<>();
	public Deck() {
		//iterate through suits
		//iterate through ranks in suits
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (int i = 0; i < suits.length; i++) {
			Suit suit = suits[i];
			for (int j = 0; j < ranks.length; j++) {
				Rank rank = ranks[j];
				Card card = new Card(suit, rank);
				cardsDeck.add(card);
			}
			
		}
		//adds a card to the deck
		
	}
	
	public int checkDeckSize() {
		int cardsAmount = cardsDeck.size();
		//count how many cards in list
		//return how many cards in list
		return cardsAmount;
	}
	public Card getCard () {
		//deals a card from the deck
		Card pickedCard = cardsDeck.remove(0);
		//card is removed from deck and it's value is returned
		return pickedCard;
	}
	public void shuffleDeck() {
		Collections.shuffle(cardsDeck);
	}
	

}
