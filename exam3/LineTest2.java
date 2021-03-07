class LineTest2 {
	public static void main(String[] args) {
		Line[] lines = {
				new DottedLine('@', 12, 2),
				new DottedLine('!', 7, 1),
				new DottedLine('#', 13, 2),
				new ArrowLine('-', 3, true),
				new ArrowLine('-', 3, false),
				new ArrowLine('-', 3, true)
		};
		for (int i=0; i<lines.length; i++)
			lines[i].draw();
	}
}
