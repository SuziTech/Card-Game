import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.KING);
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void deckHasOneCard() {
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void deckHas52Cards() {
        deck.add52Cards();
        assertEquals(52, deck.cardCount());
    }
}
