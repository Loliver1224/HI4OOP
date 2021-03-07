class MyClass {
    int n1, n2;
    MyClass(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    int sum() {
        return n1 + n2;
    }
    int divide() {
        return n1 / n2;
    }
    public static void main(String[] args) {
        MyClass mc = new MyClass(5, 0);
        try {
            System.out.println("sum: " + mc.sum());
            System.out.println("divide: " + mc.divide());
        } catch(Exception e) {
            StackTraceElement[] ste = e.getStackTrace();
            // --- print Exception name ---
            String exc_name = e.getClass().getName();
            int exc_name_index = exc_name.lastIndexOf('.') + 1; // from after the last period
            System.out.println(exc_name.substring(exc_name_index, exc_name.length()) + "が生じました．");
            // --- print reason ---
            System.out.println("理由: " + e.getMessage());
            // --- show stack trace ---
            System.out.println("例外が生じた過程:");
            for (int i = ste.length-1; i >= 0; i--) {
                // --- get Exception details ---
                String method_name = ste[i].getMethodName();
                String class_name = ste[i].getClassName();
                String file_name = ste[i].getFileName();
                int line_num = ste[i].getLineNumber();
                // --- print ---
                System.out.print(i==0 ? "--> " : "    ");
                System.out.print(class_name + "." + method_name + "\t");
                System.out.println("(" + file_name + ": " + line_num + "行目を実行)");
            }
            System.out.println("--> 例外発生");
        }
    }
}
