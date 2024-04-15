
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    static String S, T;
    static int Slen;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        S = br.readLine();
        T = br.readLine();
        Slen = S.length();

        if(solve(T)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean solve(String T){
        if(T.length() == Slen){
            if(T.equals(S)){
                return true;
            }else{
                return false;
            }
        }

        //맨 뒤가 A라면 A를 빼고 다시 탐색
        if(T.charAt(T.length()-1)=='A'){
            if(solve(T.substring(0,T.length()-1))){
                return true;
            }
        }
        //맨 앞이 B라면 B를 빼고 뒤집은 것만 다시 탐색
        if(T.charAt(0) == 'B'){
            StringBuilder reverse = new StringBuilder();
            reverse.append(T.substring(1,T.length()));
            if(solve(reverse.reverse().toString())){
                return true;
            }
        }
        return false;
    }
}