
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> fruitMap = new HashMap<>();
        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken(); //과일
            int n = Integer.parseInt(st.nextToken()); //숫자
            if(fruitMap.containsKey(s)){ //map에 과일이 포함되어있으면
                fruitMap.put(s,fruitMap.get(s)+n);
            }else{ //map에 과일이 없으면
                fruitMap.put(s,n);
            }
        }
        if(fruitMap.containsValue(5)){ //map의 value값에 5가 있으면
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}