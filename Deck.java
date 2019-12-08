import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	// fields
	private String name;
	private List<Card> cards;
	private final String[] suits = new String[] {"Diamonds", "Hearts", "Spades", "Clubs"};
	private final int[] values = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

	//constructor
	public Deck() {
		cards = new ArrayList<Card>();
		
		for (int value : values) {
			for (String suit : suits) {
				cards.add(new Card (value, suit));
			}
		}
	}
	
	// methods
	public void displayData() {
		for (Card card : cards) {
			if (card.getValue() == 11) {
				System.out.println("Jack of " + card.getSuit());
			} else if (card.getValue() == 12) {
				System.out.println("Queen of " + card.getSuit());
			} else if (card.getValue() == 13) {
				System.out.println("King of " + card.getSuit());
			} else if (card.getValue() == 14) {
				System.out.println("Ace of " + card.getSuit());
			} else {
				System.out.println(card.getValue() + " of " + card.getSuit());
			}	
	}
} 
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return getCards().remove(0);
	}
	
	//getters and setters
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public String[] getSuits() {
		return suits;
	}

	public int[] getValues() {
		return values;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
