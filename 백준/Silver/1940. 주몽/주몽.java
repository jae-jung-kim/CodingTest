import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] N_Arr = new int[N];
        for(int i=0; i<N; i++){
            N_Arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N_Arr);

        int start = 0;
        int end = N_Arr.length - 1;
        int count = 0;
        while(start < end){
            if(N_Arr[start] + N_Arr[end] == M){
                count++;
                start++;
            }else if(N_Arr[start] + N_Arr[end] < M){
                start++;
            }else{
                end--;
            }
        }

        System.out.println(count);
    }
}
