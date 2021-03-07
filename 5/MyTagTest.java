class MyTagTest {
    public static void main(String[] args) {
        MyDecoratedTag dt = new MyDecoratedTag("Bob", '#', 3);
        dt.show();
        dt.rotate();
        dt.show();
        dt.rotate();
        dt.show();

        System.out.println();

        MyTag ft1 = new MyFramedTag("Chris", 0);
        ft1.show();
        ft1.rotate();
        ft1.show();
        ft1.rotate();
        ft1.show();

        System.out.println();

        MyTag ft2 = new MyFramedTag("Chris", 2);
        ft2.show();
        ft2.rotate();
        ft2.show();
        ft2.rotate();
        ft2.show();

    }
}
