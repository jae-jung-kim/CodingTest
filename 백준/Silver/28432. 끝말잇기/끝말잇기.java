import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        int n = list.indexOf("?");

        char afterFirst = '0';
        char beforeEnd = '0';
        String s = "";
        if(N==1){
            int M = Integer.parseInt(br.readLine());
            System.out.println(br.readLine());
        }else{
            if (n == 0) { //?가 맨앞
                afterFirst = list.get(1).charAt(0);
            } else if (n == N - 1) { //?가 맨뒤
                s = list.get(n - 1);
                beforeEnd = s.charAt(s.length() - 1);
            } else { //?가 중간
                s = list.get(n - 1);
                beforeEnd = list.get(n - 1).charAt(s.length() - 1);
                afterFirst = list.get(n + 1).charAt(0);
            }

            int M = Integer.parseInt(br.readLine());
            String result = "";
            for (int i = 0; i < M; i++) {
                s = br.readLine();
                if ((s.charAt(0) == beforeEnd || beforeEnd == '0')
                        && (s.charAt(s.length() - 1) == afterFirst || afterFirst == '0')
                        && !list.contains(s)){
                    result = s;
                }
            }
            System.out.println(result);
        }
    }
}