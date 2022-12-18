package practiceAutomatedWar;

public class App {

	public static void main(String[] args) {
	
//2a. asks to instantiate a Deck and two players, call the shuffle method on the Deck
		
		Deck thisDeck = new Deck();
		Player firstPlayer = new Player("Kristen");
		Player secondPlayer = new Player("Eliza");
	    thisDeck.shuffle();
		
// 2b using a traditional for loop, iterate 52 times calling the draw method on the other player each
// iteration using the Deck you instantiated 
// it sounds like they are asking for every other, time so that is the reason for the odds and evens
	    
	    for(int i = 0; i < 52; i ++) {
        	if(i % 2 ==0) {
        		
        	firstPlayer.draw(thisDeck);}
         else {
        	secondPlayer.draw(thisDeck);
        
           }
	    }
	    
//2c asking traditional for loop, iterate 26 times and call the flip method 
// for every player, I added in some strings so it would be more clear 
	    
	       Card firstPlayerCard;
	       Card secondPlayerCard; 
	    for (int i =0; i <26; i++) {
	    	
	    	 firstPlayerCard =firstPlayer.flip();
	    	 secondPlayerCard =secondPlayer.flip();
	    	 
//3a)	Using the Card describe() method when each card is flipped illustrates the game play.
	    	 System.out.println("Hello Player One!");
	    	 firstPlayerCard.describe();
	    	 System.out.println("Hello Player Two!");
	    	 secondPlayerCard.describe();
	    	// System.out.println("The first players card is " + firstPlayerCard.getValue() + " it is the " + firstPlayerCard.getName());
	    	// System.out.println("The second players card is " +  secondPlayerCard.getValue() + " it is the " + secondPlayerCard.getName());
	
// 2d Compare value of each card returned by the two players flip method
// here we must use conditional if statement
//Call the incrementScore method on the player whose card has the higher value.
//3b)	Printing the winner of each turn adds interest.  
//c)	Printing the updated score after each turn shows game progression.
	    	    
	  	   if(firstPlayerCard.getValue() >  secondPlayerCard.getValue()) {
	  		   firstPlayer.incrementScore();
	  		   System.out.println("Player one gets the point");
	  		   System.out.println("Player one score is: " + firstPlayer.returnScore());
	  		   System.out.println("Player two score is: " + secondPlayer.returnScore());
	  		   System.out.println("____________________________");
	  	   } else if (secondPlayerCard.getValue() > firstPlayerCard.getValue()){
	  		   secondPlayer.incrementScore();
	  		   System.out.println("Players two gets the point");
	  		   System.out.println("Player one score is: " + firstPlayer.returnScore());
	  		   System.out.println("Player two score is: " + secondPlayer.returnScore());
	  		   System.out.println("____________________________");
	  	   }
	    	
	    }   
	 
	
	    
// 2e)	After the loop, compare the final score from each player. 
// 2f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher
// or if they are both the same.
// d)	At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.
    
	         System.out.println("First Player Total Score: " + firstPlayer.returnScore());
	         System.out.println("Second Player Total Score: " + secondPlayer.returnScore());
	    if(firstPlayer.returnScore()> secondPlayer.returnScore()) {
	    	
	    	System.out.println("The first player, Kristen, won!" );
	    }else  if (secondPlayer.returnScore()> firstPlayer.returnScore()){
	    	System.out.println("The second player, Eliza, won!");
	    }else {
	    	System.out.println("Draw");
	    }
	  
	    
   }
	

}
