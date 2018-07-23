package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	Card playerCard;

	public BlackjackHand() {
		
	}
	@Override
	public int getHandValue() {
		//iterate through hand
		List<Card> myHand = getHand();
		int handValue = 0;
		for (int i = 0; i < myHand.size(); i++) {
			playerCard = myHand.get(i);
			handValue += playerCard.getValue();			
		}
		//call cards value here
		//calculate sum of values
		return handValue;
	}


}
