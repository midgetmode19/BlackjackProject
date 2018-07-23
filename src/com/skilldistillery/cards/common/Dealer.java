package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Dealer {
	Hand hand = new BlackjackHand(); //has a hand
	private Deck deck;
	public Dealer() {
		this.deck = new Deck(); // constructor, creates new deck for the game
	}
	public Hand getHand() {
		return hand;
	}
	public Card getCard() {
		return this.deck.DeckGetCard();
	}

	public void shuffleDeck() {
		deck.shuffleDeck();
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
