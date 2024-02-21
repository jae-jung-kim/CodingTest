import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // 같은 원일때
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }
            // 원이 내접하거나 외접할때
            else if (Math.pow(r1 + r2, 2) == distance || Math.pow(r2 - r1, 2) == distance) {
                System.out.println(1);
            }
            // 원이 접하지 않을때
            else if (Math.pow(r1 + r2, 2) < distance || Math.pow(r2 - r1, 2) > distance) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }
}