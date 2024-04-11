import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
        int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int[][] dis = new int[N][M];
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr[i][j] = input;
                dis[i][j] = Integer.MAX_VALUE;
                if (input == 1) {
                    queue.add(new Node(i, j));
                    dis[i][j] = 0;
                }
            }
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 8; i++) {
                int next_x = now.x + dx[i];
                int next_y = now.y + dy[i];

                if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < M) {
                    if (dis[next_x][next_y] > dis[now.x][now.y] + 1) {
                        dis[next_x][next_y] = dis[now.x][now.y] + 1;
                        queue.add(new Node(next_x, next_y));
                        answer = Math.max(answer, dis[next_x][next_y]);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}