class UniqueTag extends Tag {
    int pheight;

    UniqueTag(String name, int pheight) {
        super(name);
        this.pheight = pheight;
    }

    @Override
    void show() {
        int height = pheight * 2 + 1;
        int width = pheight * 2 - 1;
        int name_padding = (width - name.length()) / 2;
        for (int i=0; i<height; i++) {
            if (name_padding < 0 && i != pheight)
                for (int j=name_padding; j<0; j++)
                    System.out.print(' ');
            for (int j=0; j<width; j++) {
                if (i < pheight) {
                    if (j < i)
                        System.out.print(' ');
                    else if (i + j < width)
                        System.out.print('+');
                } else if (i > pheight) {
                    if (j < pheight - (i - pheight - 1) - 1)
                        System.out.print(' ');
                    else if (j < i - 1)
                        System.out.print('+');
                } else {
                    if (j < name_padding)
                        System.out.print(' ');
                    else {
                        System.out.print(name);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    int max(int d1, int d2) {
        return d1 > d2 ? d1 : d2;
    }
    int abs(int d) {
        return d < 0 ? -1*d : d;
    }
}
