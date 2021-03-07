import java.util.Scanner;

class SumTest {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        Scanner in = new Scanner(System.in);
        for(i=0; i<3; i++) {
            System.out.print("Input number: ");
            sum += in.nextInt();
        }
        System.out.println("sum: " + sum);
        double avg = (double)sum / i;
        System.out.println("average: " + String.format("%.1f", avg));
    }
}
