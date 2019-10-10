import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck () {
        this.deck = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void add52Cards() {

//        for (int i = 0; i < 4(); i++) {
//            for (int j = 0; j < 14; j++)
//                deck.add(card);
//        }
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }

    public void shuffle() {
        Collections.shuffle(deck, new Random(2));
    }
}
