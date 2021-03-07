class MyTool {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println(String.valueOf(n).length());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        catch (Exception e) {
            System.out.println("catch Exception");
        }
    }
}
