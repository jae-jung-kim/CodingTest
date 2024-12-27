import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         StringBuilder sb = new StringBuilder();

         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());

         st = new StringTokenizer(br.readLine());
         int[] NArray = new int[N+1];
         int[] NSumArray = new int[N+1];

         for(int i=1; i<NArray.length; i++){
                 NArray[i] = Integer.parseInt(st.nextToken());

         }

         NSumArray[1] = NArray[1];

         for(int i=2; i<NSumArray.length; i++){
             NSumArray[i] = NSumArray[i-1] + NArray[i];
         }

         for(int t=0; t<M; t++){
             st = new StringTokenizer(br.readLine());
             int i = Integer.parseInt(st.nextToken());
             int j = Integer.parseInt(st.nextToken());
             sb.append(NSumArray[j]-NSumArray[i-1]).append("\n");
         }

        System.out.println(sb.toString().trim());

    }
}
