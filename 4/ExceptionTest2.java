import java.util.Scanner;

class ExceptionTest2 {
	public static void main(String[] args) {
		if (args.length < 1) // コマンドライン引数がない場合終了
			System.exit(0);
		int x = Integer.parseInt(args[0]);

		switch(x) {
			case 0:
				System.out.println("NoSuchElementExceptionを発生させます．");
                Scanner sc = new Scanner("");
                sc.next();
				break;
			case 1:
				System.out.println("NegativeArraySizeExceptionを発生させます．");
                int[] a = new int[-1];
				break;
			case 2:
				System.out.println("ArrayStoreExceptionを発生させます．");
                String[] ss = new String[1];
                Object[] obj = ss;
                obj[0] = new Integer(0);
				break;
		}
	}
}
