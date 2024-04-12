import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] arr_diff = new int[N-1];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        for(int i=0;i<N-1;i++) {
            arr_diff[i] = arr[i+1] - arr[i];

        }
        Arrays.sort(arr_diff);

        for(int i=0;i< (N-1) - (K-1); i++) {
            answer += arr_diff[i];
        }
        System.out.println(answer);

    }
}