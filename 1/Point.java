class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(Point p) {
        double d = Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
        return d;
    }
}
