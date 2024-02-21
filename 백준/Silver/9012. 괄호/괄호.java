import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Loop1:
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            String[] PS = s.split("");
            int index = 0;
            boolean a = true;
            for (String p : PS) {
                if (p.equals("(")) {
                    index++;
                } else {
                    index--;
                }
                if (index < 0) {
                    System.out.println("NO");
                    a = false;
                    break;
                }
            }
            if (a) {
                if (index == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}