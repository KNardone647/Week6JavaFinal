package practiceAutomatedWar;

import java.util.ArrayList;
import java.util.List;



public class Player {
	
//	c.	Player
//	i.	Fields
//	1.	hand (List of Card)
//	2.	score (set to 0 in the constructor)
//	3.	name

	
	List<Card> hand = new ArrayList<Card>();
    int score; 
    String name; 
	
// constructor for Player, setting score to 0 within constructor, passing in name so it can
// be called in the App method
    
	public Player(String name) {
		this.name = name; 
		this.score = 0;
	}
	
//	ii.	Methods
//	1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
	
	
	public void describe() {
		System.out.println("Hello" + name + "These are your cards ");
		for (Card thisCard: hand) {
			thisCard.describe();
		}
	}
	
//	ii.	Methods
//	2.	flip (removes and returns the top card of the Hand)

	public Card flip() {
		return hand.remove(0); 
		}
	
//	ii.	Methods		
//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)

	public void draw(Deck newCard) {
		 hand.add(newCard.draw());	
	}
	
//	ii.	Methods
//	4.	incrementScore (adds 1 to the Player’s score field)

	
	public void incrementScore() {
		this.score = (score +1);
	}

// added in returnScore method because it is needed later to call the score 
	
     public int returnScore() {
    	 return this.score;
     }
	
	
	
		
}
