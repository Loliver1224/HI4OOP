class MyDecoratedTag extends MyTag {
    char decochar;
    int decolen;

    MyDecoratedTag(String name, char decochar, int decolen) {
        super(name);
        this.decochar = decochar;
        this.decolen = decolen;
    }
    void show() {
        for (int i=0; i<decolen; i++)
            if (rotated)
                System.out.println(decochar);
            else
                System.out.print(decochar);
        if (rotated) {
            System.out.println();
            for (int i=0; i<name.length(); i++)
                System.out.println(name.charAt(i));
            System.out.println();
        } else
            System.out.print(" " + name + " ");
        for (int i=0; i<decolen; i++)
            if (rotated)
                System.out.println(decochar);
            else
                System.out.print(decochar);
        System.out.println();
    }
    void rotate() {
        rotated = !rotated;
    }
}
