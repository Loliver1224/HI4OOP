class ExceptionTest {
	public static void main(String[] args) {
		if (args.length < 1) // コマンドライン引数がない場合終了
			System.exit(0);
		int x = Integer.parseInt(args[0]);

		switch(x) {
			case 0:
				System.out.println("ArithmeticExceptionを発生させます．");
				System.out.println(2 / 0);
				break;
			case 1:
				System.out.println("ArrayIndexOutOfBoundsExceptionを発生させます．");
				// write code here
                System.out.println(args[-1]);
				break;
			case 2:
				System.out.println("NumberFormatExceptionを発生させます．");
				// write code here
                Integer.parseInt("0.1");
				break;
			case 3:
				System.out.println("NullPointerExceptionを発生させます．");
				// write code here
                String ss = null;
                System.out.println(ss.length());
				break;
		}
	}
}
