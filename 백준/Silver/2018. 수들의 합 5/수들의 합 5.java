import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int sum = 1;
        int start_Point = 1;
        int end_Point = 1;

        while(end_Point != N){
            if(sum==N){
                count++;
                end_Point++;
                sum+=end_Point;
            }else if(sum>N){
                sum-=start_Point;
                start_Point++;
            }else{
                end_Point++;
                sum+=end_Point;
            }
        }

        System.out.println(count);
    }
}
