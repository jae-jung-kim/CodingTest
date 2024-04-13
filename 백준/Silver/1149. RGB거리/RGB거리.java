
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][3]; //RED GREEN BLUE를 나누기 위해 3

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); //RED(0)
            cost[i][1] = Integer.parseInt(st.nextToken()); //GREEN(1)
            cost[i][2] = Integer.parseInt(st.nextToken()); //BLUE(2)
        }

        for(int i=1; i<N; i++){
            cost[i][0] += Math.min(cost[i-1][1],cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0],cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0],cost[i-1][1]);
        }

        int result = Math.min(Math.min(cost[N-1][0],cost[N-1][1]),cost[N-1][2]);
        System.out.println(result);
    }
}