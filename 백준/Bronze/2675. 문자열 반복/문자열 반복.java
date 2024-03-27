
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for(int t=0; t<T; t++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int i=0; i<S.length(); i++){
                for(int j=0; j<R; j++){
                    sb.append(S.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}