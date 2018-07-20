package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	List<Card> cardsInHand = new ArrayList<>();
	Card card;

	public BlackjackHand() {
		
	}

	@Override
	public int getHandValue() {
		//iterate through hand
		int handValue = 0;
		for (int i = 0; i < cardsInHand.size(); i++) {
			int playerCard = card.getValue();
			handValue += playerCard;			
		}
		//call cards value here
		//calculate sum of values
		return handValue;
	}


}
