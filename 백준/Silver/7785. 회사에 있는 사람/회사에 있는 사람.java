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
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken(); //이름
            String enter = st.nextToken(); //enter나 leave를 날리기 위해
            if(map.containsKey(name)){ //map에 이름이 있으면
                map.remove(name); //leave니까 지우고
            }else{
                map.put(name,enter); //아니면 map에 put
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet()); //map을 ArrayList에 넣고
        Collections.sort(list,Collections.reverseOrder()); //정렬후 뒤집기
        for(String s:list){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}