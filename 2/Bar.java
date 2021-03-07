class Bar {
    int len;
    char pattern;

    Bar() {
        len = 3;
        pattern = '*';
    }

    Bar (int len, char pattern) {
        this.len = len;
        this.pattern = pattern;
    }

    void draw(boolean isvert) {
        for (int i=0; i<len; i++) {
            System.out.print(pattern);
            if (isvert)
                System.out.println();
        }
        if (!isvert)
            System.out.println();
    }

    void draw(int times) {
        for (int n=0; n<len; n++) {
            for (int i=0; i<len; i++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }
}
