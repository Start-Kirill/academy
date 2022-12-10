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

		/* Algorithm of initialization of the deck */
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				if (j == 0) {
					if (i < 9) {
						deck[i][j] = String.valueOf(i + 2) + " of Hearts";
					} else if (i == 9) {
						deck[i][j] = "Jack of Hearts";
					} else if (i == 10) {
						deck[i][j] = "Queen of Hearts";
					} else if (i == 11) {
						deck[i][j] = "King of Hearts";
					} else {
						deck[i][j] = "Ace of Hearts";
					}
				} else if (j == 1) {
					if (i < 9) {
						deck[i][j] = String.valueOf(i + 2) + " of Diamonds";
					} else if (i == 9) {
						deck[i][j] = "Jack of Diamonds";
					} else if (i == 10) {
						deck[i][j] = "Queen of Diamonds";
					} else if (i == 11) {
						deck[i][j] = "King of Diamonds";
					} else {
						deck[i][j] = "Ace of Diamonds";
					}
				} else if (j == 2) {
					if (i < 9) {
						deck[i][j] = String.valueOf(i + 2) + " of Clubs";
					} else if (i == 9) {
						deck[i][j] = "Jack of Clubs";
					} else if (i == 10) {
						deck[i][j] = "Queen of Clubs";
					} else if (i == 11) {
						deck[i][j] = "King of Clubs";
					} else {
						deck[i][j] = "Ace of Clubs";
					}
				} else {
					if (i < 9) {
						deck[i][j] = String.valueOf(i + 2) + " of Spades";
					} else if (i == 9) {
						deck[i][j] = "Jack of Spades";
					} else if (i == 10) {
						deck[i][j] = "Queen of Spades";
					} else if (i == 11) {
						deck[i][j] = "King of Spades";
					} else {
						deck[i][j] = "Ace of Spades";
					}
				}
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
