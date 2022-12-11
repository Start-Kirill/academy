/*
 * Homework #1
 * Task # 3
 * 
 * Kirill Starovoitov
 */
package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implementation of Task # 3 of Homework #1. The program ask for input the
 * number of players and deals cards. Dealt cards are shown in console.
 * 
 * @version 1.0 09 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class Deal {

	private static final Random rand = new Random();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Input the number of players in range from 2 to 10. Otherwise input will be
		 * repeated.
		 */
		int n;
		do {
			System.out.print("Enter the number of players(2 - 10): ");
			n = sc.nextInt();
		} while (n < 2 || n > 10);

		String[][] deck = makeDeck(); // Making the deck

		deal(deck, n); // dealing

		sc.close();
	}

	/**
	 * The method makes the deck of 52 cards.
	 * 
	 * @return Array String[13 - ranks][4 - suits]
	 */
	static String[][] makeDeck() {

		/* Array for storing the deck of 52 cards */
		String[][] deck = new String[13][4];

		String[] suits = { " of Hearts", " of Diamonds", " of Clubs", " of Spades" };
		String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		/* Algorithm of initialization of the deck */
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				deck[i][j] = ranks[i] + suits[j];
			}
		}
		return deck;

	}

	/**
	 * The method deals cards from deck to n players
	 * 
	 * @param deck The deck of 52 cards
	 * @param n    The number of players
	 */
	static void deal(String[][] deck, int n) {

		int rank = 0; // Variable for storing random card's rank

		int suit = 0; // Variable for storing random card's suit

		String[][] hands = new String[n][5]; // Array for storing dealt cards

		/* Algorithm of cards dealing */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				do {
					rank = rand.nextInt(13);
					suit = rand.nextInt(4);
				} while (deck[rank][suit] == null);

				hands[i][j] = deck[rank][suit];
				deck[rank][suit] = null;
			}
			System.out.println("Cards of " + (i + 1) + " player:");
			System.out.println(Arrays.toString(hands[i]));
			System.out.println();
		}

	}

}
