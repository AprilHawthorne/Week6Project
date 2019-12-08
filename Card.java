
public class Card {
	
	//fields
	private int value;
	private String suit;
	private String name;
	
	//constructor
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;	
	}

	//methods
	public static String describe (int value, String suit) {
		String result = value + ", " + suit;
		return result;
	}
	
	//getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
}
