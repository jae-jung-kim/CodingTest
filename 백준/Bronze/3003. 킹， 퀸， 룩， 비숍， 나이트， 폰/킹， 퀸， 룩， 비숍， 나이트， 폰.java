import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] chess = new int[6];
        chess[0] = 1;
        chess[1] = 1;
        chess[2] = 2;
        chess[3] = 2;
        chess[4] = 2;
        chess[5] = 8;
        int[] addChess = new int[6];
        Arrays.fill(addChess, 0);

        for(int i=0; i<chess.length; i++){
            int n = Integer.parseInt(st.nextToken());
            while(chess[i] != n){
                if(chess[i]<n){
                    n--;
                    addChess[i]--;
                }else{
                    n++;
                    addChess[i]++;
                }
            }
        }

        for(int i=0; i<addChess.length; i++){
            sb.append(addChess[i]).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}
