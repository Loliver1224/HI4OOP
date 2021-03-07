class CardSimulator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("勝負の回数を引数に入力してください");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        int[] score = new int[n];

        for (int i=1; i<=n; i++) {
            Card[] c = {new Card(), new Card()};
            System.out.print("[" + i + "] " + "CPU1: " + c[0] + " vs " + "CPU2: " + c[1] + " :  ");
            if (c[0].isSameAs(c[1]))
                System.out.println("DRAW");
            else if (c[0].isStrongerThan(c[1])) {
                System.out.println("CPU1 wins!");
                score[0]++;
            } else {
                System.out.println("CPU2 wins!");
                score[1]++;
            }
        }
        System.out.println("Score:");
        System.out.println("   CPU1: " + score[0]);
        System.out.println("   CPU2: " + score[1]);
        String result;
        if (score[0] == score[1])
            result = "DRAW";
        else if (score[0] > score[1])
            result = "CPU1 wins!!";
        else
            result = "CPU2 wins!!";
        System.out.println(result);
    }
}
