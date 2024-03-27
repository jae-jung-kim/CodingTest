
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //처음숫자
        StringBuilder sb1 = new StringBuilder(st.nextToken());
        int n1 = Integer.parseInt(sb1.reverse().toString()); //뒤집어서 int로 만들기
        //두번재숫자
        StringBuilder sb2 = new StringBuilder(st.nextToken());
        int n2 = Integer.parseInt(sb2.reverse().toString()); //뒤집어서 int로 만들기
        System.out.println(Math.max(n1, n2));
    }
}