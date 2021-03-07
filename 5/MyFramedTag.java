class MyFramedTag extends MyTag {
    int padding;

    MyFramedTag(String name, int padding) {
        super(name);
        this.padding = padding;
    }
    void show() {
        int height = padding * 2 + 3;
        int width = padding * 2 + name.length() + 2;
        if (rotated) {
            int tmp = height;
            height = width;
            width = tmp;
        }
        for (int i=0; i<height; i++) {
            boolean is_border_h = i % (height-1) == 0;
            for (int j=0; j<width; j++) {
                boolean is_border_w = j % (width-1) == 0;
                if (is_border_h && is_border_w)
                    System.out.print('+');
                else if (is_border_h)
                    System.out.print('-');
                else if (is_border_w)
                    System.out.print('|');
                if (rotated) {
                    if (j == padding+1 && i > padding && i < height-padding-1)
                        System.out.print(name.charAt(i-padding-1));
                    else if (!is_border_h && !is_border_w)
                        System.out.print(' ');
                } else {
                    if (i == padding+1 && j > padding && j < width-padding-1)
                        System.out.print(name.charAt(j-padding-1));
                    else if (!is_border_h && !is_border_w)
                        System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    void rotate() {
        rotated = !rotated;
    }
}
