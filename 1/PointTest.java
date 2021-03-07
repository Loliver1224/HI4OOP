// 1-5T (3)まで - 2020/6/16
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class PointTest {
    public static void main(String[] args) {
        final int W_MAX = 24, H_MAX = 16;
        final int P_MAX = 10;

        Random rand = new Random();
        Point[] points = new Point[P_MAX];
        String[][] graph = new String[H_MAX][W_MAX];
        for (String[] c: graph) {
            Arrays.fill(c, ".");
        }

        for (int i=0; i<P_MAX; i++) {
            points[i] = new Point(rand.nextInt(W_MAX), rand.nextInt(H_MAX));
            graph[points[i].y][points[i].x] = Integer.toString(i);
        }

        Point pmin = new Point(-1, -1);
        double pmin_dist = Integer.MAX_VALUE;
        for (int h=0; h<H_MAX; h++) {
            for (int w=0; w<W_MAX; w++) {
                Point tmp_p = new Point(h, w);
                double sum_dist = 0;
                for (int i=0; i<P_MAX; i++) {
                    sum_dist += tmp_p.getDistance(points[i]);
                }
                if (sum_dist < pmin_dist) {
                    pmin_dist = sum_dist;
                    pmin.x = w;
                    pmin.y = h;
                }
            }
        }
        graph[pmin.y][pmin.x] = "X";

        for (int h=0; h<H_MAX; h++) {
            for (int w=0; w<W_MAX; w++) {
                System.out.printf("%2s",graph[h][w]);
            }
            System.out.println("");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("\nどの点について調べますか?: ");
        int p = in.nextInt();
        double dmax = -1.0;
        double dmin = Math.sqrt(W_MAX*W_MAX - H_MAX*H_MAX) + 1;
        int dmax_point = -1, dmin_point = -1;
        for (int i=0; i<P_MAX; i++) {
            if (i != p) {
                double dist = points[p].getDistance(points[i]);
                if (dist > dmax) {
                    dmax_point = i;
                    dmax = dist;
                }
                if (dist < dmin) {
                    dmin_point = i;
                    dmin = dist;
                }
            }
        }
        System.out.printf("最も近い点は点%d（距離%.3f）\n", dmin_point, dmin);
        System.out.printf("最も遠い点は点%d（距離%.3f）\n", dmax_point, dmax);
    }
}
