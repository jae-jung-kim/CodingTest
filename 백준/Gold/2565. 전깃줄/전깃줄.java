
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
            1. 최대한 설치 가능한 개수를 구하고
            2. 전체개수 - 설치가능개수 를 구하면
            3. 철거개수가 나온다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[][] wire = new int[N][2]; //[0]=A전기줄, [1]=B전기줄

        for(int i=0; i<wire.length; i++){
            st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }

        // A전봇대를 기준으로 정렬
        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        //최장 증가 부분 수열(LIS)사용
        for(int i=0; i<dp.length; i++){
            dp[i] = 1;
            /*
             * i번째 전봇대를 기준으로 이전의 전봇대들의
             * 전선을 연결하기 위한 탐색
             * 즉, i번째 전봇대에 연결된 B전봇대는
             * 탐색할 j번째 전봇대에 연결된 B전봇대보다 값이 커야함
             */
            for(int j=0; j<i; j++){
                if(wire[i][1]>wire[j][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int max = 0;
        for(int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        // 전체 개수 - 설치 가능한 전깃줄 = 최소 철거 개수
        System.out.println(N - max);
    }
}