class Player {
    public static final int CARD_MAX = 3;
    private Card[] cards;
    private int cardslen;
    private int point;

    Player() {
        cards = new Card[CARD_MAX];
        for(int i=0; i<CARD_MAX; i++) {
            cards[i] = new Card();
        }
        cardslen = cards.length;
    }

    void showCards() {
        for(int i=0; i<cardslen; i++) {
            System.out.printf("No.%d:%s\n", i+1, cards[i]);
        }
    }

    int addPoint(int p) {
        point += p;
        return point;
    }

    int getPoint() {
        return point;
    }

    int getLength() {
        return cardslen;
    }

    Card putCard(int index) {
        return cards[index];
    }

    void fight(int index, Player enemy, int index_enemy) {

        if(cards[index].isSameAs(enemy.putCard(index_enemy))) {
            System.out.println("～ 引き分け ～");
        }
        else if(cards[index].isStrongerThan(enemy.putCard(index_enemy))) {
            System.out.println("Playerの" + cards[index] + "の勝ち!");
            addPoint(1);
        }
        else {
            System.out.println("Computerの" + enemy.putCard(index_enemy) + "の勝ち!");
            enemy.addPoint(1);
        }
    }

    // 抜き取ったカードを配列から除去
    void throwCard(int index) {
        for(int i=0; i<cardslen; i++) {
            if(i == index) {
                for(int j=i; j<cardslen-1; j++)
                    cards[j] = cards[j+1];
                cards[cardslen-1] = null;
            }
        }
        cardslen--;
    }
}
