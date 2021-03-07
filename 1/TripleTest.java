class TripleTest {
    public static void main(String[] args) {
        Triple t1 = new Triple();
        t1.set(8, 8, 8);
        t1.show();
        Triple t2 = new Triple();
        t2.set(2, 3, 1);
        t2.show();

        System.out.println("[maxメソッドの確認]");
        System.out.println("t1の最大値: " + t1.max());
        System.out.println("t2の最大値: " + t2.max());

        System.out.println("[isAllSameメソッドの確認]");
        System.out.println("t1はすべて同じか: " + t1.isAllSame());
        System.out.println("t2はすべて同じか: " + t2.isAllSame());

        System.out.println("[hasPairメソッドの確認]");
        System.out.println("t1は2つ以上同じか: " + t1.hasPair());
        System.out.println("t2は2つ以上同じか: " + t2.hasPair());

        System.out.println("[addメソッドの確認]");
        t1.add(t2);
        t1.show();
    }
}
