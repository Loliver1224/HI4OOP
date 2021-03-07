class ArrowLine extends Line {
	private boolean leftward;	// 左向き

	ArrowLine(char ch, int len, boolean leftward) {
		super(ch, len);
		this.leftward = leftward;
	}
    void changeDirection() {
        leftward = !leftward;
    }
    @Override
    void draw() {
        for (int i=0; i<getLen(); i++) {
            if (leftward && i == 0)
                System.out.print('<');
            else if (!leftward && i == getLen()-1)
                System.out.print('>');
            else
                System.out.print(getCh());
        }
        System.out.println();
    }
}
