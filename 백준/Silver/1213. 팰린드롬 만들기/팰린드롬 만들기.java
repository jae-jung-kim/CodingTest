import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] alphabet = new int[26];

        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'A']++;
        }

        int oddNumber = 0;
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i]%2!=0){
                oddNumber++;
            }
        }
        String first = "";
        String middle = "";
        String end = "";
        if(oddNumber>1){
            System.out.println("I'm Sorry Hansoo");
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<alphabet.length; i++) {
                for (int j = 0; j < alphabet[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                }
            }
            first = sb.toString();
            end = sb.reverse().toString();

            for(int i=0; i<alphabet.length; i++){
                if(alphabet[i]%2==1){
                    middle = String.valueOf((char)(i+'A'));
                }
            }
            System.out.println(first+middle+end);
        }
    }
}