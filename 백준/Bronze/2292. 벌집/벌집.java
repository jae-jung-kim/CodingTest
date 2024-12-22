import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int count = 1;
        int range = 2;
        int i = 1;
        if (a == 1) {
            System.out.println(1);
        }else{
            while (range <= a) {
                range = range + (6 * i);
                i++;
                count++;
            }

            System.out.println(count);
        }
    }
}
