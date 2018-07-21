package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> hand = new ArrayList<>();//a hand is an arraylist of cards
	
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
		return "Hand Value" + getHandValue();
	}
	
	
}
