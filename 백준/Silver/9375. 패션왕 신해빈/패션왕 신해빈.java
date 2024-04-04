import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        /*
        1. 각 종류별로 의상이 몇개 있는지 map<의상종류, 개수> 저장
        2. 옷을 안입을 수도 있으니까 의상종류마다 개수 + 1
        3. 그런데 다 안입는 경우는 빼야하니까 전체 경우의 수에서 다 안입는 경우의 수 -1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for(int t=0; t<tc; t++){
            HashMap<String, Integer> map = new HashMap<>();

            int N = Integer.parseInt(br.readLine());

            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); //옷 이름은 필요없음
                String kind = st.nextToken(); //옷 종류

                if(map.containsKey(kind)){ //옷의 종류가 있으면
                    map.put(kind,map.get(kind)+1); //kind의 value값에 +1
                }else{
                    map.put(kind,1); //종류가 없으면 map에 등록
                }
            }
            int result = 1;
            for(int val : map.values()){
                result *= (val+1); // 옷을 안입는 경우를 +1해주면서 result에 곱해준다
            }
            sb.append(result-1).append("\n"); //다 안입는 경우 1가지를 빼줌.
        }
        System.out.println(sb);
    }

}