package practiceAutomatedWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
//	b.	Deck
//	i.	Fields
//	1.	cards (List of Card)
// added in cardValues for the values, and suitNames for the type of suit 
	
	Integer[] cardValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	String[] suitNames = {"Hearts", "Spades", "Diamonds", "Clubs"};
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	
//	ii.	Methods
//	3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
// used an enhanced for loop to iterate around both arrays of cardValue and suitNames, then created a string with a
// switch statement with represents the fullNameOfCard and added that to the ArrayList of cards 

	
	public Deck() {
		
	for(Integer cardValue: cardValues) {
		for(String suitName: suitNames) {
			
			
			String fullNameOfCard = "";
			
			switch(cardValue){
				case 2: 
					fullNameOfCard = "Two of " + suitName;
					break;
				case 3: 
					fullNameOfCard = "Three of " + suitName;
					break;
				case 4: 
					fullNameOfCard = "Four of " + suitName;	
					break;
				case 5: 
					fullNameOfCard = "Five of " + suitName;	
					break;
				case 6: 
					fullNameOfCard = "Six of " + suitName;	
					break;
				case 7: 
					fullNameOfCard = "Seven of " + suitName;
					break;
				case 8: 
					fullNameOfCard = "Eight of " + suitName;
					break;
				case 9: 
					fullNameOfCard = "Nine of " + suitName;
					break;
				case 10: 
					fullNameOfCard = "Ten of " + suitName;
					break;
				case 11: 
					fullNameOfCard = "Jack of " + suitName;
					break;
				case 12: 
					fullNameOfCard = "Queen of " + suitName;
					break;
				case 13: 
					fullNameOfCard = "King of " + suitName;
					break;
				case 14: 
					fullNameOfCard = "Ace of " + suitName;
					break;
			        }
			
			    
			cards.add(new Card(cardValue, fullNameOfCard));
			
		
					
			}
		}
	  }


//	1.	shuffle (randomizes the order of the cards)

	
    public void shuffle(){
	Collections.shuffle(cards);
	     }
    
//	2.	draw (removes and returns the top card of the Cards field)

	public Card draw() {
		return cards.remove(0);
	}
	
	
	}

