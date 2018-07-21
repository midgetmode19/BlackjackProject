package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Player;

public class BlackjackSimulator {
	private Scanner sc = new Scanner(System.in);
	private Deck deck = new Deck(); // constructor, creates new deck for the game
	private Dealer dealer = new Dealer(); // construct dealer to use deck
	private Player player = new Player(); // construct player, will need to do this many times if more than one //
											// player(loop)
	private Card cardInPlay; // do not use "new" operator because cards come from the deck.
	public String dealOrQuit = "";
	public int hitStayOrQuit = -1;

	public static void main(String[] args) {
		BlackjackSimulator dealer = new BlackjackSimulator();
		System.out.println("Welcome. Lets play a game of Blackjack!");
		dealer.run();
	}

	public void run() {
		deck.shuffleDeck(); // shuffle the deck
		startGame();
		// deal cards
	}

	public void printPlayOptions() {
		System.out.println("1: Hit");
		System.out.println("2: Stay");
		System.out.println("0: Quit");
		// stretch goals: betting, double down, split hands
	}

	public void startGame() {

		System.out.println("Let's play some Blackjack!");
		System.out.println("Would you like to be dealt a hand? (Y/N");
		dealOrQuit = sc.next();
		// try/catch here
		if (dealOrQuit.equalsIgnoreCase("Y")) {
			playBlackjack();

		} else if (dealOrQuit.equalsIgnoreCase("N")) {
			System.out.println("Thanks anyway!");
			System.exit(0);
		} else {
			System.out.println("Invalid input.");
		}


		// maybe try/catch for input that is NAN
	}

	public void playBlackjack() {
		//deal first cards before this starts
		do {
			
			hitStayOrQuit = sc.nextInt();
			if (hitStayOrQuit == 1) {
				printPlayOptions();
				// cardInPlay = deck.getCard(); //gets one card. put this card in as a parameter
				// to getHandCard?
			} else if (hitStayOrQuit == 2) {
				// dealer's turn
				// decide if player wins or loses
				// back to startmenu/play again?
			} else if (hitStayOrQuit == 0) {
				System.out.println("Thanks for playing!");
				System.exit(0);
			} else {
				System.out.println("Invalid selection.");
			}

		} while (hitStayOrQuit != 0);
		// back to simulator, if(dealer topCard value == 10||11), compare to hidden
		// value of facedown dealer card
		// else, ask player to hit or stay (while (playerHandValueSum <= 21))
		// if hiddenDealerCardValue + topCard value == 21, dealer wins. ask to play
		// again
		// if player chose hit, add another card to playerHand. Print out player's total
		// hand value, check less than 21.
		// ask player to hit or stay again.
		// if playerHandValueSum > 21, player busts. Sysout("Bust! You lose! Would you
		// like to play again?")
		// if player stays, now check dealer hand. while(dealerHandSumValue < 17, dealer
		// must draw another card.)
		// when dealerHandValueSum >= 17 && <= 21, compare to playerHandValueSum.
		// if both sums ==, push
		// if playerSum > dealerSum, player win
		// if dealerSum > playerSum, dealer win
		// ask to play again.
	}

}
