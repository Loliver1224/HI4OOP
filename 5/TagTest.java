import java.util.Scanner;

class TagTest {
    public static void main(String[] args) {
        Tag tags[] = new Tag[100];
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true) {
            System.out.println("[1] Normal Tag, [2] Decorated Tag, [3] Framed Tag, [4] ラムセウム・テンティリス ... [9] Draw and quit");
            System.out.print("Select one: ");
            int kind = sc.nextInt();
            if (kind == 9)
                break;
            System.out.print("Name?: ");
            String name = sc.next();
            switch (kind) {
                case 1: tags[n] = new Tag(name); n++; break;
                case 2: System.out.print("Decoration char?: ");
                        char decochar = sc.next().charAt(0);
                        System.out.print("How long?: ");
                        int decolen = sc.nextInt();
                        tags[n] = new DecoratedTag(name, decochar, decolen);
                        n++; break;
                case 3: System.out.print("Padding?: ");
                        int padding = sc.nextInt();
                        tags[n] = new FramedTag(name, padding);
                        n++; break;
                case 4: System.out.print("Pyramid height?: ");
                        tags[n] = new UniqueTag(name, sc.nextInt());
                        n++; break;
                default: break;
            }
            System.out.println();
        }

        for (int i=0; i<n; i++) {
            System.out.println();
            tags[i].show();
        }
    }
}
