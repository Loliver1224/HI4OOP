class Card {
    enum Suit {SPADE, HEART, DIAMOND, CLUB, JOKER}
    private Suit suit;
    private int number;

    Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getNumber() {
        return number;
    }
    public static Suit[] getSuitKind() {
        Suit[] suitkind = {Suit.SPADE, Suit.HEART, Suit.DIAMOND, Suit.CLUB};
        return suitkind;
    }
    @Override
    public String toString() {
        String card_num = String.valueOf(number);
        char suitid = suit.name().charAt(0);
        String return_str;
        if (suit == Suit.JOKER)
            return_str = "[ " + suitid + " ]";
        else if (card_num.length() < 2)
            return_str = "[" + suitid + " " + card_num + "]";
        else
            return_str = "[" + suitid + card_num + "]";
        return return_str;
    }
    public boolean cardEquals(Card card) {
        if (card.getSuit() == suit && card.getNumber() == number)
            return true;
        return false;
    }
}
