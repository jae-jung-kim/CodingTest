import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        int T = Integer.parseInt(br.readLine());
        for(int tc=0; tc<T; tc++){
            int minX=0, minY=0, maxX=0, maxY=0, dir=0, nowX=0, nowY=0;
            //dir은 보는 방향
            //dir==0 -> 위쪽, dir==1 -> 오른쪽, dir==2 -> 아래쪽, dir==3 -> 왼쪽

            String command = br.readLine();

            for(int i=0; i<command.length(); i++){
                char c = command.charAt(i);
                if(c=='F'){
                    nowX += dx[dir];
                    nowY += dy[dir];
                }else if(c=='B'){
                    nowX -= dx[dir];
                    nowY -= dy[dir];
                }else if(c=='L'){
                    if(dir==0){
                        dir=3;
                    }else{
                        dir--;
                    }
                }else if(c=='R'){
                    if(dir==3){
                        dir=0;
                    }else{
                        dir++;
                    }
                }

                minX = Math.min(minX, nowX);
                minY = Math.min(minY, nowY);
                maxX = Math.max(maxX, nowX);
                maxY = Math.max(maxY, nowY);
            }
            sb.append((Math.abs(minX)+Math.abs(maxX))*(Math.abs(minY)+Math.abs(maxY))).append("\n");
        }
        System.out.println(sb);
    }
}