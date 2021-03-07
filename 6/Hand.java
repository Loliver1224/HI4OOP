class Hand {
    private Card hand[] = new Card[5];
    private int[] dist = new int[13];  // 手札カード番号分布
    private int score = 0;

    Hand(Card hand[]) {
        for (int i=0; i<5; i++) {
            this.hand[i] = hand[i];
            dist[hand[i].getNumber() - 1]++;
        }
    }
    // for JOKER
    Hand() {
        score = -1;
    }
    public int getScore() {
        return score;
    }
    public String getResult() {
        judgeScore();
        switch (score) {
            case 800:
                return "<<< Royal Flush!!!! >>>";
            case 700:
                return "<<< four of a kind!!!! >>>";
            case 600:
                return "<<< full house!!!! >>>";
            case 500:
                return "<< flush!!! >>";
            case 400:
                return "<< Straight!!! >>";
            case 300:
                return "<< three of a kind!!! >>";
            case 200:
                return "< two pair!! >";
            case 100:
                return "< one pair! >";
            default:
                return "no pairs..";
        }
    }
    public void judgeScore() {
        /* TODO: 役が同じ場合，ハイカードで勝敗を判定できるように */
        /* ↑役なしのときのみ */
        if (hasRoyalFlush())
            score = 800;
        else if (hasNOfAKind(4))
            score = 700;
        else if (hasFullHouse())
            score = 600;
        else if (hasFlush())
            score = 500;
        else if (hasStraight())
            score = 400;
        else if (hasNOfAKind(3))
            score = 300;
        else if (hasTwoPair())
            score = 200;
        else if (hasOnePair())
            score = 100;
        else {
            if (dist[0] != 0)
                score = 13;
            else {
                for (int i=1; i<13; i++) {
                    if (dist[i] != 0)
                        score = i;
                }
            }
        }
    }
    private boolean hasOnePair() {
        for (int p: dist) {
            if (p >= 2)
                return true;
        }
        return false;
    }
    private boolean hasTwoPair() {
        int pairs = 0;
        for (int p: dist) {
            if (p >= 2)
                pairs++;
        }
        return (pairs == 2);
    }
    private boolean hasNOfAKind(int n) {
        for (int p: dist) {
            if (p == n)
                return true;
        }
        return false;
    }
    private boolean hasHighestStraight() {
        for (int i=9; i<=13; i++) {
            if (dist[i%13] != 1)
                return false;
        }
        return true;
    }
    private boolean hasStraight() {
        if (hasHighestStraight())
            return true;

        int flg = 0;
        for (int p: dist) {
            if (p >= 2)
                return false;
            if (flg == 0 && p == 1)
                flg = 1;
            else if (flg > 0) {
                if (p == 1)
                    flg++;
                else
                    return false;
            }
            if (flg == 5)
                return true;
        }
        return false;
    }
    private boolean hasFlush() {
        for (int i=1; i<5; i++) {
            if (hand[0].getSuit() != hand[i].getSuit())
                return false;
        }
        return true;
    }
    private boolean hasFullHouse() {
        return (hasNOfAKind(3) && hasNOfAKind(2));
    }
    private boolean hasStraightFlush() {
        return (hasStraight() && hasFlush());
    }
    private boolean hasRoyalFlush() {
        return (hasHighestStraight() && hasFlush());
    }
}
