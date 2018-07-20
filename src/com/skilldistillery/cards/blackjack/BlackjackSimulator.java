package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Player;

public class BlackjackSimulator {
	private Scanner sc = new Scanner(System.in);
	private Deck deck = new Deck(); //constructor, creates new deck for the game
	private Dealer dealer = new Dealer(); //construct dealer to use deck
	private Player player = new Player(); //construct player, will need to do this many times if more than one player(loop)
	private Card cardInPlay; //do not use "new" operator because cards come from the deck.

	public static void main(String[] args) {
		BlackjackSimulator dealer = new BlackjackSimulator();
		System.out.println("Welcome. Lets play a game of Blackjack!");
		dealer.run();
	}

	public void run() {
		playCards();
		// shuffle deck
		// deal cards
	}
	public void printMenu() {
		System.out.println("1: Hit");
		System.out.println("2: Stay");
		System.out.println("0: Quit");
		//stretch goals: betting, double down, split hands
	}

	public void playCards() {
		//back to simulator, if(dealer topCard value == 10||11), compare to hidden value of facedown dealer card
				//else, ask player to hit or stay (while (playerHandValueSum <= 21))
					//if hiddenDealerCardValue + topCard value == 21, dealer wins. ask to play again
			//if player chose hit, add another card to playerHand. Print out player's total hand value, check less than 21.
				//ask player to hit or stay again.
				//if playerHandValueSum > 21, player busts. Sysout("Bust! You lose! Would you like to play again?")
			//if player stays, now check dealer hand. while(dealerHandSumValue < 17, dealer must draw another card.)
				//when dealerHandValueSum >= 17 && <= 21, compare to playerHandValueSum.
				//if both sums ==, push
				//if playerSum > dealerSum, player win
				//if dealerSum > playerSum, dealer win
					//ask to play again.

		
		int input = -1;
		do {
			printMenu();
		
			input = sc.nextInt();

			if (input == 1) {
				// cardInPlay = deck.getCard(); //gets one card. put this card in as a parameter to getHandCard?
			}
			else if(input == 2) {
				//dealer's turn
			}
			else if(input == 3) {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid selection.");
			}

		} while (input != 0);
		// maybe try/catch for input that is NAN
	}

}
