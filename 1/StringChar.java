public class StringChar {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Too few arguments.");
        } else {
            try {
                int c = Integer.parseInt(args[1]);
                System.out.println(args[0].charAt(c));
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
