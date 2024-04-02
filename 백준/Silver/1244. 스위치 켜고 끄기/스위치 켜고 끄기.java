import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] switches;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        switches = new int[N+2];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            switches[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int studentNumber = Integer.parseInt(st.nextToken());
        for(int i=0; i<studentNumber; i++){
            st = new StringTokenizer(br.readLine());
            int gen = Integer.parseInt(st.nextToken());
            int switchNumber = Integer.parseInt(st.nextToken());
            if(gen==1){
                int index = switchNumber;
                while(switchNumber<=N){
                    changeNumber(switches, switchNumber);
                    switchNumber+=index;
                }
            }else{
                int left = switchNumber-1;
                int right = switchNumber+1;
                while(left!=0&&right!=N+1){
                    if(switches[left]!=switches[right]) {
                        break;
                    }
                    left--;
                    right++;
                }
                for(int j = left+1; j<right; j++){
                    if(switches[j]==1){
                        switches[j]=0;
                    }else{
                        switches[j]=1;
                    }
                }

            }
        }
        for(int i=1; i<=N; i++){
            sb.append(switches[i]).append(" ");
            if(i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }

    public static void changeNumber(int[] switches, int switchNumber){
        if(switches[switchNumber]==0){
            switches[switchNumber]=1;
        }else{
            switches[switchNumber]=0;
        }
    }
}