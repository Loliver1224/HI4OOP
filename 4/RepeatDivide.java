import java.util.Random;
import java.util.Scanner;

public class RepeatDivide {
    static final int MAX = 1000;
    public static void main(String[] args) {

        Random rnd = new Random();
        int r = rnd.nextInt(MAX);
        Scanner in = new Scanner(System.in);
        int val = r;
        System.out.println(val);

        while(true) {
            System.out.print("Input integer : ");
            String line = in.nextLine();
            try {
                val = val / Integer.parseInt(line);
                System.out.println(val);
            }
            catch (ArithmeticException e) {
                System.out.println("不正な算術です．\nゼロで除算はできません．");
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("不正な値です．\n整数値を入力してください．");
                break;
            }
        }
    }
}
