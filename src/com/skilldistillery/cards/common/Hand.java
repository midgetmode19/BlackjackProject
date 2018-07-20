package com.skilldistillery.cards.common;

import java.util.List;

public abstract class Hand {
	//a hand is an array or list of cards
	public Hand() {
		
	}
	public abstract int getHandValue();
	
	public void addHandCard(Card card) {

	}
	public void getHandCard(List<Card> cardsDeck) {
		
	}
	@Override
	public String toString() {
		//possibly edit this
		return "Hand [getHandValue()=" + getHandValue() + ", toString()=" + super.toString() + "]";
	}
	
	
}
