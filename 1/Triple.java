class Triple {
    int s[] = new int[3];

    void set(int num1, int num2, int num3) {
        s[0] = num1;
        s[1] = num2;
        s[2] = num3;
    }
    void show() {
        System.out.printf("%d %d %d\n", s[0], s[1], s[2]);
    }
    int max() {
        int max = Integer.MIN_VALUE;
        for (int n: s) {
            if (n > max) max = n;
        }
        return max;
    }
    boolean hasPair() {
        return (s[0]==s[1] || s[0]==s[2] || s[1]==s[2]) ? true : false;
    }
    boolean isAllSame() {
        return (s[0]==s[1] && s[1]==s[2]) ? true : false;
    }
    void add(Triple t) {
        for (int i=0; i<3; i++) {
            s[i] += t.s[i];
        }
    }
}
