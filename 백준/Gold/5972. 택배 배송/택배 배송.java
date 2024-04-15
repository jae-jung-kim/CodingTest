
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] dist;
    static ArrayList<Node>[] list;
    static boolean[] visited;
    public static class Node implements Comparable<Node>{
        int d;
        int cost;

        public Node(int d, int cost){
            this.d=d;
            this.cost=cost;
        }

        @Override
        public int compareTo(Node n) {
            return this.cost - n.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[s].add(new Node(e,cost));
            list[e].add(new Node(s,cost));
        }

        visited = new boolean[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, 50000001); //50000 * 1000 + 1
        dijkstra();
        System.out.println(dist[N]);
    }

    public static void dijkstra(){
        PriorityQueue<Node> q = new PriorityQueue<>();
        dist[1] = 0;
        q.offer(new Node(1,0));

        while(!q.isEmpty()){
            Node current = q.poll();

            if(!visited[current.d]){
                visited[current.d] = true;
            }else{
                continue;
            }

            for(int i=0; i<list[current.d].size(); i++){
                Node next = list[current.d].get(i);
                if(dist[next.d] > dist[current.d] + next.cost){
                    dist[next.d] = dist[current.d] + next.cost;
                    q.offer(new Node(next.d, dist[next.d]));
                }
            }
        }
    }
}