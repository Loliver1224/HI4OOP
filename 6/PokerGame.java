import java.util.Scanner;

class PokerGame {
    public static void main(String[] args) {
        System.out.println("+------------------+");
        System.out.println("|    Poker Game    |");
        System.out.println("+------------------+\n");

        System.out.println("--- ゲームモード選択 ---");
        System.out.print("JOKER を使用しますか? (yes/no): ");
        Scanner sc = new Scanner(System.in);
        boolean use_joker = false;
        try {
            if (sc.nextLine().charAt(0) == 'y') {
                use_joker = true;
                System.out.println("JOKER を1枚使用しゲームを開始します");
            } else {
                System.out.println("JOKER を使用せずゲームを開始します");
            }
        } catch (Exception e) {}
        System.out.println("\n\n--- GAME START ---\n");

        // init
        CardDeck cs = new CardDeck(use_joker);
        cs.shuffle();

        // get hand
        Player p = new Player(cs);
        Player c = new Player(cs);

        System.out.println("Computer:");
        System.out.println("[ * ] - [ * ] - [ * ] - [ * ] - [ * ]\n");
        System.out.println("Player:");
        p.reDeal(cs);

        // judge
        System.out.println("Player:");
        p.showHand();
        p.judge();
        System.out.println(p.getResult());
        System.out.println("\nComputer:");
        c.showHand();
        c.judge();
        System.out.println(c.getResult());
        System.out.println();

        int p_score = p.getScore();
        int c_score = c.getScore();
        if (p_score > c_score) {
            System.out.println("--- Playerの勝ち!!!! ---");
        } else if (p_score == c_score) {
            System.out.println("--- 引き分け ---");
        } else {
            System.out.println("--- Computerの勝ち ---");
        }
        System.out.println();
    }
}
