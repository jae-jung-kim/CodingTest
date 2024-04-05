import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] result = new int[2]; //0이랑 제일 가까운 두 값을 저장할 배열
        int s=0; //start 인덱스
        int e=N-1; //end 인덱스
        int min = Integer.MAX_VALUE; //0이랑 가까운지
        Arrays.sort(arr);
        while(s<e){
            int sum = arr[s]+arr[e]; //start인덱스와 end인덱스 더해주고
            
            if(min > Math.abs(sum)){ //min보다 작으면
                min = Math.abs(sum);
                
                result[0] = arr[s];
                result[1] = arr[e];
                
                if(sum==0) break; //0보다 0에 가까울수 없으므로 break;
            }
            if(sum<0){ //더한게 음수면 값이 더 커져야 하니까 start++;
                s++;
            }else{ //아니면 end--;
                e--;
            }
        }
        System.out.println(result[0]+" "+result[1]);

    }
}