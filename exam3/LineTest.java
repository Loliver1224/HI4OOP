class LineTest {
	public static void main(String[] args) {
		Line line = new Line('=', 5);
		line.draw();
		
		DottedLine dline1 = new DottedLine('#', 7, 3);
		dline1.draw();
		DottedLine dline2 = new DottedLine('-', 10, 2);
		dline2.draw();
		DottedLine dline3 = new DottedLine('~', 3, 5);
		dline3.draw();
		
		ArrowLine aline1 = new ArrowLine('-', 3, true);
		aline1.draw();
		aline1.changeDirection();
		aline1.draw();
		ArrowLine aline2 = new ArrowLine('-', 1, false);
		aline2.draw();
		aline2.changeDirection(); 
		aline2.draw();
	}
}
