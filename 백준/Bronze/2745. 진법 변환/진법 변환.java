
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int mul = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if (c >= 'A' && c <= 'Z') { //영어일때
                sum += (c - 55) * mul; //10이 A이므로 65-10=55
            } else {
                sum += (c - '0') * mul; //아니면 그냥 숫자이므로
            }
            mul *= B;
        }
        System.out.println(sum);
    }

}