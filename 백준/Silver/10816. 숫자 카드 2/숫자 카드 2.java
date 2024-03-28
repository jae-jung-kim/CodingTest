import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int key = 0;

        int N = Integer.parseInt(st.nextToken()); //N가져오기
        Map<Integer,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());  //N정수 가져오기
        for(int i=0; i<N;i ++){
            key = Integer.parseInt(st.nextToken());
            map.put(key,map.getOrDefault(key,0)+1);
        }

        st = new StringTokenizer(br.readLine()); //M가져오기
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()); //M정수 가져오기
        for(int i=0; i<M; i++){
            key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)){
                sb.append(map.get(key)).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}