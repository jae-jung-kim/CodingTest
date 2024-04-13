
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for(int i=0; i<N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[K+1];
        dp[0] = 1; //0을 만드는 경우의 수는 아무것도 안뽑는 한가지 이기 때문에
        for(int i=0; i<N; i++){
            for(int j=coin[i]; j<=K; j++){
                dp[j] += dp[j-coin[i]];
            }
        }

        System.out.println(dp[K]);
    }
}