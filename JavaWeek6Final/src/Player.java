import java.util.ArrayList;
import java.util.List;

public class Player {
        
        private List<Card> hand = new ArrayList<Card>();

        private int score;
        private String playerName;

        public Player(String playerName) {
            this.playerName = playerName;
            score = 0;
        }

        // Assignment calls for this, but I didn't see where it was to be used.
        public void describe() {
        	System.out.println(playerName + "'s hand:");
            for (Card card : hand) {
                card.describe();
            }
        }
        
        public Card flip() {
            return hand.remove(0);
        }
        
        public void draw(Deck deck) {
            hand.add(deck.draw());
        }
        
        public void incrementScore() {
            score++;
        }

        public int getScore() {
            return score;
        }

		public String getplayerName() {
			return playerName;
		}

		public void setName(String playerName) {
			this.playerName = playerName;
		}

    }