import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            queue.add(br.readLine());
        }

        int count = 0;
        for(int i=0; i<N; i++){
            String s = br.readLine();
            if(!queue.peek().equals(s)){
                count++;
                queue.remove(s);
            }else{
                queue.poll();
            }
        }
        System.out.println(count);
    }
}