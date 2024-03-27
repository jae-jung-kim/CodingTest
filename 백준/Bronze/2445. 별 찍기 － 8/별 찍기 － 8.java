
import java.io.IOException;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){ //1번째 줄부터 n번째 줄까지
            star(i,n);
        }
        for(int i=n-1; i>=1; i--){ //n+1번째 줄부터 끝까지
            star(i,n);
        }
        System.out.println(sb.toString());
    }

    public static void star(int i, int n){
        StringBuilder sbf = new StringBuilder();
        sbf.append("*".repeat(i)); //i만큼 *을 반복하고
        for(int j=i; j<n; j++){
            sbf.append(" "); //n-i만큼의 부분 공백으로 채우기
        }
        String s = sbf.toString() + sbf.reverse().toString(); //원래문자열과 뒤집은 문자열 합쳐주기
        sb.append(s);
        sb.append("\n");
    }
}