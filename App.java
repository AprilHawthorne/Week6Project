
public class App {

	public static void main(String[] args) {
	
		//instantiate deck and two players
		Deck deck = new Deck();
		Player player1 = new Player(0, "Anna");
		Player player2 = new Player(0, "Elsa");
		
		//shuffle deck
		deck.shuffle();
		
		// draw cards to add to each player's hand
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			player2.draw(deck);
		}
		
		//print out player info and cards in each hand
		player1.describe();
		System.out.println("");
		player2.describe();
		System.out.println("");
		
		//play game: flip each card, compare values, add points
		for (int i = 0; i < 26; i++) {
			Card currentCard1 = player1.flip();
			Card currentCard2 = player2.flip();
			
			if (currentCard1.getValue() > currentCard2.getValue()) {
				player1.incrementScore();
			} else {
				player2.incrementScore();
			}
			
		}
		
		//print out player info at end of game
		player1.describe();
		System.out.println("");
		player2.describe();
		System.out.println("");
		
		//print final scores and winner
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1: " + player1.getScore() + ", Player 2: "
					+ player2.getScore() + ", Winner: Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 1: " + player1.getScore() + ", Player 2: "
					+ player2.getScore() + ", Winner: Player 2");
		} else {
			System.out.println("Player 1: " + player1.getScore() + ", Player 2: "
					+ player2.getScore() + ", Draw");
		}

	}

}
