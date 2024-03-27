
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String[] dayOfTheWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {0,31,59,90,120,151,181,212,243,273,304,334};
        int totalDay = days[month-1]+day;
        System.out.println(dayOfTheWeek[totalDay%7]);
    }
}