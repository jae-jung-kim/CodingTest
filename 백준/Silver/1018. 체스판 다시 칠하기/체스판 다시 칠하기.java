import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[][] W = { //W로 시작
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
        };

        String[][] B = { //B로 시작
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
        };

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] board = new String[N][M];
        //board 초기화
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = String.valueOf(s.charAt(j));
            }
        }

        int Nlen = N-7;
        int MLen = M-7;
        int update = 64;
        int min = 0;
        int Wmin = 0;
        int Bmin = 0;
        for(int i=0; i<Nlen; i++){
            for(int j=0; j<MLen; j++){
                Wmin = getMin(W, board, min, i, j);
                Bmin = getMin(B, board, min, i, j);
                min = Math.min(Wmin,Bmin);
                if(min<update){
                    update = min;
                }
                min=0;
            }
        }
        System.out.println(update);
    }

    private static int getMin(String[][] chessBoard, String[][] board, int min, int i, int j) {
        int row = -1;
        int column = 0;
        for(int k=i; k<i+8; k++){
            row++;
            for(int l=j; l<j+8; l++){
                if(!board[k][l].equals(chessBoard[row][column])){
                    min++;
                }
                column++;
            }
            column = 0;
        }
        return min;
    }

}