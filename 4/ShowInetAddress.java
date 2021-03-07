import java.net.InetAddress;
import java.net.UnknownHostException;

public class ShowInetAddress {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数にホスト名を1つ指定してください．");
            return;
        }
        try {
            InetAddress addrNames[] = InetAddress.getAllByName(args[0]);
            for (int i=0; i<addrNames.length; i++) {
                System.out.println(addrNames[i].getHostAddress());
            }
        }
        catch (UnknownHostException e) {
            System.out.println("ホスト名を解決できませんでした．");
        }
    }
}
