import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int n = c.length/2;
        int answer;
        if(c.length%2==0){
            answer = evenNumber(c, n);
        }else{
            answer = oddNumber(c, n);
        }
        System.out.println(answer);

    }

    static int oddNumber(char[] c, int n){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(c[i]);
        }
        for(int i=n+1; i<c.length; i++){
            if(!st.pop().equals(c[i])){
                return 0;
            }
        }
        return 1;
    }

    static int evenNumber(char[] c, int n){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(c[i]);
        }
        for(int i=n; i<c.length; i++){
            if (!st.pop().equals(c[i])) {
                return 0;
            }
        }
        return 1;
    }
}
