import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int price = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int product = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            sum += product * count;
        }

        if(price==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

