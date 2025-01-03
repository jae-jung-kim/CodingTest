import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String N1Ant = st.nextToken();
        char[] N1Ants = new char[N1];
        int index = 0;
        for (int i = N1Ants.length - 1; i >= 0; i--) {
            N1Ants[i] = N1Ant.charAt(index);
            index++;
        }

        st = new StringTokenizer(br.readLine());
        String N2Ant = st.nextToken();
        char[] N2Ants = new char[N2];
        for (int i = 0; i < N2Ants.length; i++) {
            N2Ants[i] = N2Ant.charAt(i);
        }

        char[] totalAnt = new char[N1 + N2];
        System.arraycopy(N1Ants, 0, totalAnt, 0, N1Ants.length);
        System.arraycopy(N2Ants, 0, totalAnt, N1Ants.length, N2Ants.length);

        boolean[] flag = new boolean[N1+N2];
        for(int i=0; i<N1; i++){
            flag[i] = true;
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        char temp;
        for(int i=0; i<T; i++){
            for(int j=0; j<totalAnt.length-1; j++){
                if(flag[j] && !flag[j+1]){
                    flag[j] = false;
                    flag[j+1] = true;
                    temp = totalAnt[j];
                    totalAnt[j] = totalAnt[j+1];
                    totalAnt[j+1] = temp;
                    j++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<totalAnt.length; i++){
            sb.append(totalAnt[i]);
        }
        System.out.println(sb.toString());
    }
}
