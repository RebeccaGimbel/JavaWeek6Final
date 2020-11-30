import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    List<Card> cards = new ArrayList<Card>();

    List<String> suit = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");

    public Deck() {

        for (int i = 2; i <= 14; i++ ) {
            for (String s : suit) {
                cards.add(new Card(i, s));
            }
        }
    }

     public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}