class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card(Card.TYPE_WATER, 5);
        Card c2 = new Card(Card.TYPE_FIRE, 8);
        System.out.println(c1 + " vs " + c2);
        if (c1.isSameAs(c2))
            System.out.println("引き分け");
        else if (c1.isStrongerThan(c2))
            System.out.println(c1 + "の勝ち");
        else
            System.out.println(c2 + "の勝ち");

        System.out.println();
        // 条件てすと
        // 強さは1~9だぞ
        int[][][] test_case = {{{Card.TYPE_FIRE, 1}, {Card.TYPE_WATER, 1}},
                                {{Card.TYPE_WATER, 1}, {Card.TYPE_GRASS, 1}},
                                {{Card.TYPE_GRASS, 1}, {Card.TYPE_FIRE, 1}},
                                {{Card.TYPE_FIRE, 1}, {Card.TYPE_FIRE, 2}},
                                {{Card.TYPE_FIRE, 1}, {Card.TYPE_WATER, 2}},
                                {{Card.TYPE_FIRE, 8}, {Card.TYPE_WATER, 1}},
                                {{Card.TYPE_FIRE, 9}, {Card.TYPE_FIRE, 9}}};

        for (int i=0; i<test_case.length; i++) {
            Card[] c = {new Card(test_case[i][0][0], test_case[i][0][1]),
                        new Card(test_case[i][1][0], test_case[i][1][1])};

            System.out.println(c[0] + " vs " + c[1]);
            if (c[0].isSameAs(c[1]))
                System.out.println("引き分け");
            else if (c[0].isStrongerThan(c[1]))
                System.out.println(c[0] + "の勝ち");
            else
                System.out.println(c[1] + "の勝ち");
            System.out.println();
        }
    }
}
