package practiceAutomatedWar;

public class Card {
	
//  a.	Card
//	i.	Fields
//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)


   	int value; 
	String name; 
	
	
	//constructor passing in the values so they can be called upon in App
	
	public Card(int value, String name) {
		this.value = value; 
		this.name = name;
	}

//	
//	ii.	Methods
//	2.	describe (prints out information about a card)

	
	public void describe() {
		System.out.println(" The name of your card is: " + name + ", Its value is: " + value );
	
	}
	
//	ii.	Methods
//	1.	Getters and Setters
	
	public int getValue() {
		return value;
	}
	public void setValue( int value) {
		this.value = value; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
}
