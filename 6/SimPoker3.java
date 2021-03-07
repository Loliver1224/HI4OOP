import java.util.Scanner;

class SimPoker3 {
    public static void main(String[] args) {
        // init
        CardDeck cs = new CardDeck();
        cs.shuffle();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times (max:17) >> ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            // get hand
            Card[] hand = {cs.deal(), cs.deal(), cs.deal()};
            // show hand
            System.out.println(hand[0] + " - " + hand[1] + " - " + hand[2]);
            // get attribute
            int h1num = hand[0].getNumber();
            int h2num = hand[1].getNumber();
            int h3num = hand[2].getNumber();
            Card.Suit h1suit = hand[0].getSuit();
            Card.Suit h2suit = hand[1].getSuit();
            Card.Suit h3suit = hand[2].getSuit();
            // judge
            if (h1num == h2num && h2num == h3num)
                System.out.println("<<< Three of a kind!!! >>>");
            else if (h1suit == h2suit && h2suit == h3suit)
                System.out.println("<< Flush!! >>");
            else if (h1num == h2num || h1num == h3num || h2num == h3num)
                System.out.println("< One pair! >");
            else
                System.out.println("No pairs...");
        }
    }
}
