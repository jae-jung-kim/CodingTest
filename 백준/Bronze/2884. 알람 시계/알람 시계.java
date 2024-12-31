import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(H==0){
            H=24;
        }

        int totalH = (60*H + M -45)/60;
        int totalM = (60*H + M -45)%60;

        if(totalH==24){
            totalH=0;
        }
        System.out.println(totalH + " " + totalM);
    }
}
