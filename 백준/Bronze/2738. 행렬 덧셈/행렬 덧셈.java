import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] sum = new int[N][M];
        //A행렬 초기화
        for(int i=0; i<N;i ++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //B행렬 초기화
        for(int i=0; i<N;i ++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //더하기
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        //StringBuilder에 담기
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sb.append(sum[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}