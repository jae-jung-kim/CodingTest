import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
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
        sb.append(totalH).append(" ").append(totalM);
        System.out.println(sb.toString());
    }
}
