import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class ToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File fo = new File("./out.txt");
            FileWriter fw = new FileWriter(fo);
            while (sc.hasNext()) {
                String ss = sc.nextLine();
                fw.write(ss.toUpperCase() + System.getProperty("line.separator"));
            }
            fw.close();
        }
        catch (IOException e) {
            System.out.println("out.txtに書き込むことができません．終了します．");
        }
    }
}
