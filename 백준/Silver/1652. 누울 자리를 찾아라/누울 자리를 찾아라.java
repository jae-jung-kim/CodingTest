import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[][] room = new String[N][N];
        int count = 0;
        int rowResult = 0;
        int colResult = 0;
        //방 구조 초기화
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                room[i][j] = String.valueOf(s.charAt(j));
            }
        }
        //가로 비교
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(room[i][j].equals(".")){ //.을 만나면 count++
                    count++;
                    if(count==2){ //count가 2면 result++
                        rowResult++;
                    }
                }else{ //x를 만나면 count는 0
                    count = 0;
                }
            }
            count = 0;
        }
        //세로 비교
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(room[j][i].equals(".")){ //.을 만나면 count++
                    count++;
                    if(count==2){ //count가 2면 result++
                        colResult++;
                    }
                }else{ //x를 만나면 count는 0
                    count = 0;
                }
            }
            count = 0;
        }
        sb.append(rowResult).append(" ").append(colResult);
        System.out.println(sb);
    }

}