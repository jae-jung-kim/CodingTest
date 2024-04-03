import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        /*
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for(int t=0; t<T; t++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<Integer> im = new LinkedList<>(); //중요도 queue
            Queue<Integer> seq = new LinkedList<>(); //순서 queue

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                seq.add(i);
                im.add(Integer.parseInt(st.nextToken()));
            }
            int count = 0;
            while(!seq.isEmpty()){
                int max = Collections.max(im);
                int cur = im.poll();
                int curIndex = seq.poll();

                if(cur==max){
                    count++;
                    if(curIndex==M){
                        sb.append(count).append("\n");
                        break;
                    }
                }else{
                    im.add(cur);
                    seq.add(curIndex);
                }
            }
        }
        System.out.println(sb);
    }
}