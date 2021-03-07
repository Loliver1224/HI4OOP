abstract class MyTag {
    String name;
    boolean rotated;

    MyTag(String name) {
        this.name = name;
        this.rotated = false;
    }

    abstract void show();
    abstract void rotate();
}
