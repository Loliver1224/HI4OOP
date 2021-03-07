class Rectangle {
    int width;
    int height;

    int getArea() {
        return height * width;
    }
    void draw(boolean fills) {
        for (int h=0; h<height; h++) {
            for (int w=0; w<width; w++) {
                if (h == 0 || h == height-1 || w == 0 || w == width-1) {
                    System.out.print("*");
                } else {
                    System.out.print(fills ? "*" : " ");
                }
            }
            System.out.println("");
        }
    }
}
