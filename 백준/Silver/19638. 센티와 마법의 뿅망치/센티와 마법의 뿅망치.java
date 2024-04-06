import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        for(int i=0; i<T; i++){
            if((pq.peek())<H ||(pq.peek()==1)){
                break;
            }
            cnt++; //망치로 한대 때렸으니까 cnt++
            pq.add(pq.poll()/2); //키가 1/2로 작아졌고 그걸 또 다시 pq에다가 add
        }
        if(pq.peek()<H){
            System.out.println("YES");
            System.out.println(cnt);
        }else{
            System.out.println("NO");
            System.out.println(pq.poll());
        }
    }
}