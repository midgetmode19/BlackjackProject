package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;

public class BlackjackSimulator {
	private Scanner sc = new Scanner(System.in);
	private Deck deck = new Deck();

	public static void main(String[] args) {
		BlackjackSimulator dealer = new BlackjackSimulator();
		dealer.run();
	}

	public void run() {
		// populate deck
		// check combination does not already exist in deck
		// add new card to the deck
		// shuffle deck
		// deal cards
		dealCards();
	}
	public void printMenu() {
		System.out.println("Welcome. Lets play a game of Blackjack!");
		System.out.println("How many cards would you like to be dealt?");
		System.out.println("1: 1 card");
		System.out.println("2: 2 cards");
		System.out.println("3: 3 cards");
		System.out.println("4: 4 cards");
		System.out.println("5: 5 cards");
		System.out.println("0: Quit");
	}

	public void dealCards() {
		// menu asks user how many cards they want to be dealt
		// display cards dealt and total value
		// make sure number is between 1 and 52 and also integer
		// maybe try/catch for input that is NAN
		
		int input = -1;
		do {
			printMenu();
		
			input = sc.nextInt();

			switch (input) {
			case 1: deck.dealCard();
				break;
			case 2: // 2 cards
				break;
			case 3: // 3 cards
				break;
			case 4: // 4 cards
				break;
			case 5: // 5 cards
				break;
			case 0: // exit game
				System.out.println("Thanks for playing!");
				System.exit(0);
				break;

			}

		} while (input != 0);
	}

}
