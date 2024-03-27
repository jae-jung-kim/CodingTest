import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken().toLowerCase();
        int[] alphabet = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            alphabet[c-'a']++;
        }

        int max = -1;
        char ch = '?';
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] >max){
                max = alphabet[i];
                ch = (char)(i+'A');
            }else if(alphabet[i]==max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}