import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A.length; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int[] S = new int[N];
        S[0]=A[0];
        for(int i=1; i<S.length; i++){
            S[i] = S[i-1] + A[i];
        }
        int sum = 0;
        for(int i=0; i<S.length; i++){
            sum+=S[i];
        }
        System.out.println(sum);
    }
}
