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
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine(),".");
            String fileName = st.nextToken();
            String extension = st.nextToken();
            if(map.containsKey(extension)){
                map.put(extension, map.get(extension)+1);
            }else{
                map.put(extension,1);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String s:list){
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}