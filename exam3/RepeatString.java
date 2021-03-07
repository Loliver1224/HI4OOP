class RepeatString {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Too few arguments.");
            System.exit(1);
        }
        try {
            for (int i=0; i<Integer.parseInt(args[1]); i++) {
                System.out.println(args[0]);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
        catch (Exception e) {
            System.out.println("catch exception.");
        }
    }
}
