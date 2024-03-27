
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = 1;
        int sum = 1;
        while(X>sum){
            n++;
            sum+=n;
        }
        X = X-(sum-n);
        if(n%2==0){
            System.out.println(X+"/"+(n-X+1));
        }else{
            System.out.println((n-X+1)+"/"+X);
        }
    }
}