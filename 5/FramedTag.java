class FramedTag extends Tag {
    int padding;  // 名前周辺の空白

    FramedTag(String name, int padding) {
        super(name);
        this.padding = padding;
    }

    @Override
    void show() {
        int height = padding * 2 + 3;
        int width = padding * 2 + name.length() + 2;
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
                else if (i == padding+1 && j > padding && j < width-padding-1)
                    System.out.print(name.charAt(j-padding-1));
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
