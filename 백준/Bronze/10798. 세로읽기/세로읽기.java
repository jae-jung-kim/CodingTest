import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] words = new char[5][15];
        int max = 0;

        for(int i=0; i<5; i++){
            String Line = br.readLine();
            if(max<Line.length()){
                max = Line.length();
            }
            for(int j=0; j<Line.length(); j++){
                words[i][j] = Line.charAt(j);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(words[j][i] == '\0')
                    continue;
                sb.append(words[j][i]);
            }
        }

        System.out.println(sb);

    }
}

