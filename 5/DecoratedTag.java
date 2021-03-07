class DecoratedTag extends Tag {
    char decochar;  // 修飾文字
    int decolen;    // 修飾の長さ

    DecoratedTag(String name, char decochar, int decolen) {
        super(name);
        this.decochar = decochar;
        this.decolen = decolen;
    }
    @Override
    void show() {
        for (int i=0; i<decolen; i++)
            System.out.print(decochar);
        System.out.print(" " + name + " ");
        for (int i=0; i<decolen; i++)
            System.out.print(decochar);
        System.out.println();
    }
}
