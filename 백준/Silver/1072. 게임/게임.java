import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       long x = Long.parseLong(st.nextToken());;
       long y = Long.parseLong(st.nextToken());
       int target = (int)((y*100)/x);

       if(target>=99){
           System.out.println(-1); //승률이 99%이상이면 몇판을 해도 더이상 변하지않는다.
           return;
       }

       int left = 0; //0번쨰부터
       int right = (int)x;//게임 횟수만큼
       int result = -1;

       while(left<=right){
           int mid = (left+right)/2;
           int z = (int)(((y+mid)*100)/(x+mid));

           if(target>=z){
               result = mid + 1;
               left = mid + 1;
           }else{
               right = mid - 1;
           }
       }

        System.out.println(result);
    }
}