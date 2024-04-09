import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int K;
    static int[] visited = new int[100001];
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);
    }

    static void bfs(int node){
        queue.add(node);
        int n = 0;
        visited[node] = 1;
        while(!queue.isEmpty()){
            n = queue.poll();
            if(n==K){
                System.out.println(visited[n]-1);
            }if(n-1>=0 && visited[n-1]==0){
                visited[n-1] = visited[n]+1;
                queue.add(n-1);
            }if(n+1<=100000 && visited[n+1]==0){
                visited[n+1] = visited[n]+1;
                queue.add(n+1);
            }if(2*n<=100000 && visited[2*n]==0){
                visited[2*n] = visited[n]+1;
                queue.add(2*n);
            }
        }
    }
}