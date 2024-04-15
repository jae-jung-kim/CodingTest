
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
            1. 리터당 기름 값이 '내림차순'일 경우에 주유하면 됨
            ex) 리터당 가격이 5 2 4 1 이면
                5주유하고 2주유하고 4는 2보다 크기 때문에 2주유하고 1주유
                -> 5 2 2 1 주유하면 됨
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N-1]; //거리
        long[] cost = new long[N]; //비용

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];

        for(int i=0; i<N-1; i++){
            if(cost[i] < minCost){
                minCost = cost[i];
            }

            sum+=(minCost*dist[i]);
        }

        System.out.println(sum);
    }
}