import java.util.Scanner;

class ToUpper {
    public static void main(String[] args) {
        System.out.print("Input String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(s.toUpperCase());
    }
}
