import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        boolean[] alphabetSet = new boolean[26];

        Arrays.fill(alphabet, -1);

        String s = br.readLine();

        for(int i=0; i<s.length(); i++){
            if(!alphabetSet[s.charAt(i)-'a']){
                alphabet[s.charAt(i)-'a'] = i;
                alphabetSet[s.charAt(i)-'a'] = true;
            }
        }

        for(int i=0; i<alphabet.length; i++){
            sb.append(alphabet[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
