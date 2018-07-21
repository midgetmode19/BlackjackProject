package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Dealer {
	Hand hand = new BlackjackHand(); //has a hand
	Card card; //hand has cards
	public Dealer() {
		
	}
	public Hand getHand() {
		return hand;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card; //adds a card to the hand
	}
	
	//gets a card from the deck (drawCards method?)
	//gives that card to player hand face up (sysout)
	//gets another card from the deck
	//places that card facedown in dealer hand (sysout card facedown)
	//gets another card from the deck
	//places that card in player hand face up (sysout)
	//gets another card from deck
	//places that card face up in dealer hand (sysout)
	//back to simulator
	
	
}
