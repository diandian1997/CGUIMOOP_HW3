import java.util.ArrayList;

public class Card {
	public enum Suit {
		Club, Diamond, Heart, Spade
	}

	// Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; // 1~13
	private Suit cardsuit;

	public Card(Suit s, int r) {
		//if (Suit.Club.ordinal() == s) {
			//  cardsuit = Suit.Club;
		//} else if (Suit.Diamond.ordinal() == s) {
			// cardsuit = Suit.Diamond;
		//} else if (Suit.Heart.ordinal() == s) {
			// cardsuit = Suit.Heart;
		//} else if (Suit.Spade.ordinal() == s) {
		//	 cardsuit = Suit.Spade;
		//}
		// suit=s;
		cardsuit=s;
		rank = r;
	}

	// TODO: 1. Please implement the printCard method
	public void printCard() {
		System.out.print("(" +getSuit() + "," + (rank == 13 ? rank + ") \n" : rank + ") "));
		// Hint: print (System.out.println) card as suit,rank, for example:
		// print 1,1 as Clubs Ace
	}

	public Suit getSuit() {
		return cardsuit;
	}

	public int getRank() {
		return rank;
	}
}