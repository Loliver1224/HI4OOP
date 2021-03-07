public class PokerTest {
    public static void main(String[] args) {
        // init
        CardDeck cs = new CardDeck();
        cs.shuffle();

        for (int i=0; i<3; i++) {
            // get hand
            Card[] hand = {cs.deal(), cs.deal(), cs.deal(), cs.deal(), cs.deal()};
            // show hand
            for (int j=0; j<5; j++) {
                System.out.print(hand[j]);
                System.out.print((j < 4) ? " - " : "\n");
            }
            // judge
            Hand gm = new Hand(hand);
            System.out.println(gm.judge());
            System.out.println();
        }
    }
}
