
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("ENTER")){
                sum += map.size();
                map.clear();
            } else{
                if(!map.containsKey(s)){
                    map.put(s,1);
                }
            }
        }
        sum += map.size();
        System.out.println(sum);
    }

}