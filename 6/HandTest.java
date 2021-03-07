public class HandTest {
    public static void main(String[] args) {
        // --- test cases ---
        Card hand[];
        hand = new Card[5];

        // no pairs
        hand[0] = new Card(Card.Suit.DIAMOND, 2);
        hand[1] = new Card(Card.Suit.SPADE, 13);
        hand[2] = new Card(Card.Suit.CLUB, 7);
        hand[3] = new Card(Card.Suit.DIAMOND, 3);
        hand[4] = new Card(Card.Suit.SPADE, 1);
        test(hand);

        // one pair
        hand[0] = new Card(Card.Suit.DIAMOND, 2);
        hand[1] = new Card(Card.Suit.SPADE, 13);
        hand[2] = new Card(Card.Suit.CLUB, 7);
        hand[3] = new Card(Card.Suit.DIAMOND, 2);
        hand[4] = new Card(Card.Suit.SPADE, 1);
        test(hand);

        // two pairs
        hand[0] = new Card(Card.Suit.DIAMOND, 2);
        hand[1] = new Card(Card.Suit.SPADE, 13);
        hand[2] = new Card(Card.Suit.CLUB, 7);
        hand[3] = new Card(Card.Suit.DIAMOND, 2);
        hand[4] = new Card(Card.Suit.SPADE, 7);
        test(hand);

        // three of a kind
        hand[0] = new Card(Card.Suit.DIAMOND, 2);
        hand[1] = new Card(Card.Suit.SPADE, 13);
        hand[2] = new Card(Card.Suit.CLUB, 7);
        hand[3] = new Card(Card.Suit.DIAMOND, 2);
        hand[4] = new Card(Card.Suit.SPADE, 2);
        test(hand);

        // flush
        hand[0] = new Card(Card.Suit.SPADE, 2);
        hand[1] = new Card(Card.Suit.SPADE, 13);
        hand[2] = new Card(Card.Suit.SPADE, 7);
        hand[3] = new Card(Card.Suit.SPADE, 3);
        hand[4] = new Card(Card.Suit.SPADE, 1);
        test(hand);

        // full house
        hand[0] = new Card(Card.Suit.SPADE, 5);
        hand[1] = new Card(Card.Suit.HEART, 5);
        hand[2] = new Card(Card.Suit.DIAMOND, 5);
        hand[3] = new Card(Card.Suit.SPADE, 6);
        hand[4] = new Card(Card.Suit.DIAMOND, 6);
        test(hand);

        // four of a kind
        hand[0] = new Card(Card.Suit.SPADE, 5);
        hand[1] = new Card(Card.Suit.HEART, 5);
        hand[2] = new Card(Card.Suit.DIAMOND, 5);
        hand[3] = new Card(Card.Suit.CLUB, 5);
        hand[4] = new Card(Card.Suit.DIAMOND, 6);
        test(hand);

        // straight
        hand[0] = new Card(Card.Suit.SPADE, 1);
        hand[1] = new Card(Card.Suit.HEART, 2);
        hand[2] = new Card(Card.Suit.DIAMOND, 3);
        hand[3] = new Card(Card.Suit.CLUB, 4);
        hand[4] = new Card(Card.Suit.DIAMOND, 13);
        test(hand);

        // straight
        hand[0] = new Card(Card.Suit.SPADE, 1);
        hand[1] = new Card(Card.Suit.HEART, 2);
        hand[2] = new Card(Card.Suit.DIAMOND, 3);
        hand[3] = new Card(Card.Suit.CLUB, 4);
        hand[4] = new Card(Card.Suit.DIAMOND, 5);
        test(hand);

        // straight
        hand[0] = new Card(Card.Suit.SPADE, 5);
        hand[1] = new Card(Card.Suit.HEART, 8);
        hand[2] = new Card(Card.Suit.DIAMOND, 4);
        hand[3] = new Card(Card.Suit.CLUB, 7);
        hand[4] = new Card(Card.Suit.DIAMOND, 6);
        test(hand);

        // highest straight
        hand[0] = new Card(Card.Suit.SPADE, 10);
        hand[1] = new Card(Card.Suit.HEART, 11);
        hand[2] = new Card(Card.Suit.DIAMOND, 12);
        hand[3] = new Card(Card.Suit.CLUB, 13);
        hand[4] = new Card(Card.Suit.DIAMOND, 1);
        test(hand);

        // royal straight
        hand[0] = new Card(Card.Suit.SPADE, 10);
        hand[1] = new Card(Card.Suit.SPADE, 11);
        hand[2] = new Card(Card.Suit.SPADE, 12);
        hand[3] = new Card(Card.Suit.SPADE, 13);
        hand[4] = new Card(Card.Suit.SPADE, 1);
        test(hand);
    }

    public static void test(Card[] hand) {
        // show hand
        for (int j=0; j<5; j++) {
            System.out.print(hand[j]);
            System.out.print((j < 4) ? " - " : "\n");
        }
        // judge
        Hand gm = new Hand(hand);
        System.out.println(gm.getResult());
        System.out.println();
    }
}
