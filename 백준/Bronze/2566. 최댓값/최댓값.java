import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] A = new int[9][9];
        int max = 0;
        int n = 0;
        int row = 1;
        int column = 1;
        for(int i=1; i<=9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=9; j++){
                n = Integer.parseInt(st.nextToken());
                if(n>max){
                    max = n;
                    row = i;
                    column = j;
                }
            }
        }
        sb.append(max).append("\n").append(row).append(" ").append(column);
        System.out.println(sb);
    }

}