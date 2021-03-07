import java.util.Scanner;

class PokerGame {
    public static void main(String[] args) {
        System.out.println("<<< Poker Game >>>");

        // init
        CardDeck cs = new CardDeck();
        cs.shuffle();
        Scanner sc = new Scanner(System.in);

        // get hand
        Card hand[];
        hand = new Card[5];
        for (int i=0; i<5; i++) {
            hand[i] = cs.deal();
        }

        int[] hold_state = {0, 1, 2, 3, 4};
        while (true) {
            showHand(hand);
            showHoldState(hold_state);
            System.out.print("残すカードを選んでください (9: 選択終了): ");
            try {
                int n = sc.nextInt();
                if (n == 9)
                    break;
                else if (n >= 0 && n <= 4)
                    hold_state[n] = -1;
            } catch (Exception e) {
                System.out.println("正しい値を入力してください");
                continue;
            }
        }
        System.out.println();
        for (int i: hold_state) {
            if (i >= 0)
                hand[i] = cs.deal();
        }
        showHand(hand);

        // judge
        Hand gm = new Hand(hand);
        System.out.println(gm.judge());
        System.out.println();
    }

    public static void showHand(Card[] hand) {
        for (int i=0; i<5; i++) {
            System.out.print(hand[i]);
            if (i != 4)
                System.out.print(" - ");
        }
        System.out.println();
    }
    public static void showHoldState(int[] state) {
        for (int s: state) {
            if (s < 0)
                System.out.print(" HLD    ");
            else
                System.out.print("  " + s + "     ");
        }
        System.out.println();
    }
}
