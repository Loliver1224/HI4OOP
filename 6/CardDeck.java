import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class CardDeck {
    private List<Card> cards = new ArrayList<Card>();

    CardDeck(boolean use_joker) {
        for (Card.Suit suit: Card.getSuitKind()) {
            for (int num=1; num<=13; num++) {
                cards.add(new Card(suit, num));
            }
        }
        if (use_joker)
            cards.add(new Card(Card.Suit.JOKER, 0));
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public Card deal() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
