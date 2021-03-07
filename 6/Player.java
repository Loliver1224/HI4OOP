import java.util.Scanner;

class Player {
    private Card[] cards;
    private Scanner sc = new Scanner(System.in);
    private Hand hand;

    Player(CardDeck cs) {
        cards = new Card[5];
        for (int i=0; i<5; i++) {
            cards[i] = cs.deal();
        }
    }

    public Card[] getHand() {
        return cards;
    }
    public void reDeal(CardDeck cs) {
        int[] throw_state = {-1, -1, -1, -1, -1};
        showHand();
        showHandIndex();
        System.out.println("\n捨てるカードを空白区切りで選んでください");
        System.out.print("(9: 全選択 / Ctrl+d で入力終了): ");
        while (true) {
            if ( !sc.hasNextInt()) break;
            try {
                int n = sc.nextInt();
                if (n == 9) {
                    for (int i=0; i<5; i++) throw_state[i] = i;
                    // break;
                } else if (n >= 0 && n <= 4)
                    throw_state[n] = n;
                else
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("正しい値を入力してください");
                continue;
            }
        }
        System.out.println();
        for (int i: throw_state) {
            if (i >= 0)
                cards[i] = cs.deal();
        }
    }
    public void judge() {
        int j_index = hasJoker();
        if (j_index >= 0) {
            // System.out.println("JOKER!!!!");
            Hand max_score_hand = new Hand();
            // clone
            Card[] cards4j = new Card[5];
            for (int i=0; i<5; i++) cards4j[i] = cards[i];
            // search max score
            for (Card.Suit suit: Card.getSuitKind()) {
                for (int num=1; num<=13; num++) {
                    Card joker = new Card(suit, num);
                    // System.out.println(joker);
                    if ( !findCard(joker)) {
                        cards4j[j_index] = joker;
                        hand = new Hand(cards4j);
                        hand.judgeScore();
                        // System.out.println(hand.getScore());
                        if (hand.getScore() > max_score_hand.getScore()) {
                            // System.out.println("in");
                            max_score_hand = hand;
                        }
                    }
                }
            }
            hand = max_score_hand;
        } else {
            hand = new Hand(cards);
        }
    }
    private int hasJoker() {
        for (int i=0; i<5; i++) {
            if (cards[i].getSuit() == Card.Suit.JOKER)
                return i;
        }
        return -1;
    }
    private boolean findCard(Card joker) {
        for (Card c: cards) {
            if (c.cardEquals(joker))
                return true;
        }
        return false;
    }
    public String getResult() {
        return hand.getResult();
    }
    public int getScore() {
        return hand.getScore();
    }
    public void showHand() {
        for (int i=0; i<5; i++) {
            System.out.print(cards[i]);
            if (i != 4)
                System.out.print(" - ");
        }
        System.out.println();
    }
    public static void showHandIndex() {
        for (int i=0; i<5; i++)
            System.out.print("  " + i + "     ");
        System.out.println();
    }
}