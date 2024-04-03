import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            String s = br.readLine();
            int sum = 0;
            boolean a = true;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='('){
                    sum+=1;
                }else{
                    sum-=1;
                }
                if(sum<0){
                    sb.append("NO").append("\n");
                    a = false;
                    break;
                }
            }
            if(a){
                if(sum==0){
                    sb.append("YES").append("\n");
                }else{
                    sb.append("NO").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}