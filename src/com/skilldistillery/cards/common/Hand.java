package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> hand = new ArrayList<>();//a hand is an arraylist of cards
	Card card;
	
	public Hand() {
		
	}
	public abstract int getHandValue();
	
	public void addCardToHand(Card card) {
		hand.add(card);
	}
	public List<Card> getHand() {
		return hand;
	}
	@Override
	public String toString() {
		//possibly edit this
		String cards = "";
		
		for (int i = 0; i < hand.size(); i++) {
			cards += "" + hand.get(i).rank + " of " + hand.get(i).suit + "\n";
		}
		
		return "Hand Value: " + getHandValue() + "\nCards: \n" + cards;
	}
	public String getDealerTopCard() {
		String card = "" + hand.get(1).rank + " of " + hand.get(1).suit + "\n";
		return card;
	}
	
	
}
