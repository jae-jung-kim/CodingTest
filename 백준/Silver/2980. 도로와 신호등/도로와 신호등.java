import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int time = 0;

        st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        time += D;

        if (R > time % (R + G)) {
            time += R - time % (R + G);
        }

        for (int i = 0; i < N - 1; i++) {
            int beforeD = D;
            st = new StringTokenizer(br.readLine());
            D = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            G = Integer.parseInt(st.nextToken());

            time += D - beforeD;
            if (R > time % (R + G)) {
                time += R - time % (R + G);
            }
        }

        time += L - D;

        System.out.println(time);
    }
}
