class ExBoxTest {
    public static void main(String[] args) {
        ExBox exbox1 = new ExBox(2, 3, true, '+');
        exbox1.draw();
        System.out.println("--------");
        ExBox exbox2 = new ExBox(3, 4, false, '#');
        exbox2.draw();
        System.out.println("--------");
        ExBox exbox3 = new ExBox(4, 5, true, '/');
        exbox3.draw();
        System.out.println("--------");
        ExBox exbox4 = new ExBox(5, 6, false, '@');
        exbox4.draw();
    }
}
