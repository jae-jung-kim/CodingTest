import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] X = new int[N];
        int[] Xsort = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int number = Integer.parseInt(st.nextToken());
            X[i] = number;
            Xsort[i] = number;
        }

        Arrays.sort(Xsort);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i=0; i<N; i++){
            int number = Xsort[i];
            if(!map.containsKey(number)){
                map.put(number,index);
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(map.get(X[i])).append(" ");
        }
        System.out.println(sb);
    }
}