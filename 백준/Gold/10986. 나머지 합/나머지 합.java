import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] rangeN = new long[N+1];
        long[] cntM = new long[M];

        long answer = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=1; i<N+1; i++){
            rangeN[i] = (rangeN[i-1] + Integer.parseInt(st.nextToken()))%M;
            if(rangeN[i] == 0 ){
                answer++;
            }
            cntM[(int)rangeN[i]]++;
        }

        for(int i=0; i<M; i++){
            if(cntM[i] > 1){
                answer += (cntM[i]*(cntM[i]-1)/2);
            }
        }
        System.out.println(answer);
    }
}
