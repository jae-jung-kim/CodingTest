import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        long max = 0;
        long min = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        long low = 0;
        long high = m*max;
        long result = Long.MAX_VALUE;
        while(low<=high){
            long mid = (low+high)/2;
            long sum = 0;
            for(int i=0; i<arr.length; i++){
                long count = mid/arr[i];

                if(sum>=m){
                    break;
                }
                sum+=count;
            }
            if(sum>=m){
                high = mid - 1;
                result = Math.min(mid,result);
            }else{
                low = mid+1;
            }
        }

        System.out.println(result);
    }
}