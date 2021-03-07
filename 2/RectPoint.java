class RectPoint {
    private int x, y, quad;

    RectPoint(int x, int y) {
        this.x = x;
        this.y = y;
        quad = getWhichQuad();
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getQuad() {
        return quad;
    }

    private int getWhichQuad() {
        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else if (x > 0 && y < 0) return 4;
        else return 0;
    }

    boolean isSameAs(RectPoint rp) {
        if (rp.getX() == x && rp.getY() == y)
            return true;
        return false;
    }
}
