import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//fields
	private List<Card> hand;
	private int score;
	private String name;
	
	//constructor
	public Player(int score, String name) {
		hand = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
	}
	
	//methods
	public void describe() {
		System.out.println("Player name: " + this.name + "\n" + "Current score: " + this.score
				+ "\n" + "Cards in hand:");
		for (Card card : hand) {
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
	
	public Card flip() {
		return getHand().remove(0);
	}
	
	public void draw(Deck deck) {
		Card removedCard = deck.draw();
		getHand().add(removedCard);
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	//getters and setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
