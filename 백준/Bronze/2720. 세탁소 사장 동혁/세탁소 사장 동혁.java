import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for(int i=0; i<T; i++){
            int change = Integer.parseInt(br.readLine());
            int quarterCount = change / quarter;
            change = change % quarter;
            int dimeCount = change / dime;
            change = change % dime;
            int nickelCount = change / nickel;
            change = change % nickel;
            int pennyCount = change / penny;
            String answer = quarterCount + " " + dimeCount + " " + nickelCount + " " + pennyCount;
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
