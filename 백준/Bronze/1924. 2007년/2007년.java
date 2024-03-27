
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        String[] dayOfTheWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {0,31,59,90,120,151,181,212,243,273,304,334};
        int totalDay = days[month-1]+day;
        System.out.println(dayOfTheWeek[totalDay%7]);
    }
}