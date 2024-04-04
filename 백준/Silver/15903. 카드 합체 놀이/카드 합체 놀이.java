import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        /*
        1. 우선순위 큐에 넣고
        2. 제일작은것끼리 더하고 다시 큐에 넣어주기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            queue.offer(Long.parseLong(st.nextToken()));
        }

        for(int i=0; i<m; i++){
            long a = queue.poll();
            long b = queue.poll();

            queue.offer(a+b);
            queue.offer(a+b);
        }

        long sum = 0;
        while(!queue.isEmpty()){
            sum+=queue.poll();
        }

        System.out.println(sum);
    }
}