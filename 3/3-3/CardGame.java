import java.util.Scanner;
import java.util.Random;

class CardGame {
    public static void main(String[] args) {
        System.out.println("<<< カードゲーム >>>");
        Player p = new Player();
        Player c = new Player();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            System.out.println("Player:");
            p.showCards();
            System.out.println("Computer:");
            c.showCards();

            System.out.print("どのカードを使いますか？" );
            int select;
            while (true) {
                select = sc.nextInt() - 1;
                if (select < 0 || select >= p.getLength())
                    System.out.println("存在するカードNo.を入力して？");
                else
                    break;
            }
            System.out.println("Player:   " + p.putCard(select));
            Random rand = new Random();
            int c_select = rand.nextInt(c.getLength());
            System.out.println("Computerは" + c.putCard(c_select) + "を選択しました．");
            p.fight(select, c, c_select);
            p.throwCard(select);
            c.throwCard(c_select);

            System.out.println("--------------------");
            System.out.println("Player:   " + p.getPoint());
            System.out.println("Computer: " + c.getPoint());
            System.out.println("--------------------\n");
        }
        String winner;
        if(p.getPoint() == c.getPoint())
            winner = "引き分け";
        else if(p.getPoint() > c.getPoint())
            winner = "Playerの勝ち!";
        else
            winner = "Computerの勝ち!";
        System.out.println(winner);
    }
}
