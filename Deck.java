import java.util.ArrayList;
import java.util.Random;

public class Deck {
	Random ran = new Random();
	ArrayList<Card> usedCard;
	public int nUsed=0;
	private ArrayList<Card> cards;

	// TODO: Please implement the constructor
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int k = 1; k <= 13; k++) {
					Card card = new Card(s, k);
					cards.add(card);
				}
			}
		}
		// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		// Hint: Use new Card(x,y) and 3 for loops to add card into deck
		// Sample code start
		// Card card=new Card(1,1); ->means new card as clubs ace
		// cards.add(card);
		// Sample code end
		shuffle();
	}

	// TODO: Please implement the method to print all cards on screen
	public void printDeck() {
		// Hint: print all items in ArrayList<Card> cards,
		// please implement and reuse printCard method in Card class
		for (Card showcard : cards) {
			showcard.printCard();
		}
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public void shuffle() {
		usedCard = new ArrayList<Card>();
		nUsed = 0;
		for (Card shufflecard : cards) {
			int changeindex = ran.nextInt(52);
			Card changecard = cards.get(changeindex);
			cards.set(cards.indexOf(shufflecard), changecard);
			cards.set(cards.indexOf(changecard), shufflecard);
		}
	}

	public Card getOneCard() {
		if (nUsed == 52) {
			shuffle();
		}
		boolean check=false;
		int gettenCardIndex=ran.nextInt(52);
		Card gettenCard = cards.get(gettenCardIndex);
		do{
			gettenCard = cards.get(gettenCardIndex);
			for(Card CheckSame:usedCard){
				if(gettenCard.equals(CheckSame)){
					check = true;
				}
			}
		}while(check);
		usedCard.add(gettenCard);
		nUsed++;
		return gettenCard;
	}
}
/*
 * Description: TODO: please add description here
 */
