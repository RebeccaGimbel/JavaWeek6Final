public class App {
	
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player1 = new Player("Bob"); 
        Player player2 = new Player("Computer");

        deck.shuffle();
        
        // Why do this in 52 when it can be done in 26? Is there a benefit for one?
        for (int i = 0; i < 26; i++ ) {
            //if ( i % 2 == 0) {
                player1.draw(deck);
           // } else {
                player2.draw(deck);
           // }
        }        
        
        // flip, read out cards, then compare and increment
        for (int i = 0; i < 26; i++ ) {
            System.out.printf("\nRound %s of 26.", i+1);
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            // not for this assignment, but a readkey to pause before starting each round would be nice
            
            System.out.print("\n" + player1.getplayerName() + "'s card      : ");
            player1Card.describe();
            System.out.print(player2.getplayerName() + "'s card : ");
            player2Card.describe();
        
            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println(player1.getplayerName() + " won this round");                
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                System.out.println(player2.getplayerName() + " won this round");
                player2.incrementScore();
            } else {
                System.out.println("How sad, it's a draw. Good luck next round.");
            }
        }
        
        // list final scores and winner
        System.out.println("\n\nThe tallies have been made...");
        System.out.println(player1.getplayerName() + "'s wins     : " + player1.getScore());
        System.out.println(player2.getplayerName() + "'s wins: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n" + player1.getplayerName() + " won the war!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("\n" + player2.getplayerName() + " won the war!");
        } else {
            System.out.println("\nNo one won the war. Does this mean we are at peace?");
        }
    }
}