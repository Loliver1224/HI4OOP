import java.util.Random;

class Card {
    // タイプを示す定数値
    public static final int TYPE_FIRE = 0;
    public static final int TYPE_WATER = 1;
    public static final int TYPE_GRASS = 2;

    private int type;
    private int number;

    Card() {
        Random rand = new Random();
        type = rand.nextInt(3);
        number = rand.nextInt(9) + 1;
    }

    Card(int type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        String[] types = {"FIRE", "WATER", "GRASS"};
        return types[type] + "[" + number + "]";
    }

    boolean isSameAs(Card c) {
        return (c.type == type) && (c.number == number);
    }

    boolean isStrongerThan(Card c) {
        if (type == c.type)
            return number > c.number;
        return type == (c.type + 1) % 3;
    }
}
