package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Player;

public class BlackjackSimulator {
	private Scanner sc = new Scanner(System.in);
	private Dealer dealer = new Dealer(); // construct dealer to use deck
	private BlackjackHand dealerHand = new BlackjackHand();
	// private List<Card> dealerCards = new ArrayList<>();
	private Player player = new Player(); // construct player, will need to do this many times if more than one //
	private BlackjackHand playerHand = new BlackjackHand();
	// private List<Card> playerCards = new ArrayList<>();
	private Card cardInPlay; // do not use "new" operator because cards come from the deck.
	public String dealOrQuit = "";
	public String playAgain = "";
	public int hitStayOrQuit = -1;

	public static void main(String[] args) {
		BlackjackSimulator bjs = new BlackjackSimulator();
		System.out.println("Welcome. Lets play a game of Blackjack!");
		do {
			try {
				bjs.run();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input.");
			}
		} while (!(bjs.playAgain.equalsIgnoreCase("Y")));
	}

	public void run() {
		dealer.shuffleDeck(); // shuffle the deck
		dealer.getCard();
		startGame();
		// deal cards
	}

	public void printPlayOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1: Hit");
		System.out.println("2: Stay");
		System.out.println("0: Quit");
		System.out.print(">> ");
		// stretch goals: betting, double down, split hands
	}

	public void startGame() {

		System.out.println("Let's play some Blackjack!");
		System.out.println("Would you like to be dealt a hand? (Y/N)");
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

	public void playAgainMenu() {
		// try/catch(InputMismatchException)
		System.out.println("Would you like to play again? (Y/N)");
		playAgain = sc.next();
		if (dealOrQuit.equalsIgnoreCase("Y")) {
			playBlackjack();

		} else if (dealOrQuit.equalsIgnoreCase("N")) {
			System.out.println("Thanks anyway!");
			System.exit(0);
		} else {
			System.out.println("Invalid input.");
		}
	}

	public void playBlackjack() {
		// deal first cards before this starts
		cardInPlay = dealer.getCard();
		playerHand.addCardToHand(cardInPlay);
		cardInPlay = dealer.getCard();
		dealerHand.addCardToHand(cardInPlay); // getCard returns Card
		cardInPlay = dealer.getCard();
		playerHand.addCardToHand(cardInPlay);
		cardInPlay = dealer.getCard();
		dealerHand.addCardToHand(cardInPlay); // getCard returns Card

		System.out.println("Your Hand:");
		System.out.println(playerHand.toString());
		System.out.println("Dealer's top card: " + dealerHand.getDealerTopCard());

		printPlayOptions();
		do {

			hitStayOrQuit = sc.nextInt();
			if (hitStayOrQuit == 1) {
				cardInPlay = dealer.getCard();
				playerHand.addCardToHand(cardInPlay);

				System.out.println();
				System.out.println("Your Hand:");

				if (playerHand.getHandValue() > 21) { // checks if player went over 21
					System.out.println("Bust!! You lose! </3");
					playAgainMenu(); // currently selecting no still gets dealt another card and continues the game

				} else {
					System.out.println(playerHand.toString());
					System.out.println("Dealer's top card: " + dealerHand.getDealerTopCard());

					printPlayOptions();
				}
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
